package com.example.salesofgood.service;

import com.example.salesofgood.exception.NotFoundException;
import com.example.salesofgood.mapper.WashingMachineMapper;
import com.example.salesofgood.model.FilterDto;
import com.example.salesofgood.model.WashingMachineDto;
import com.example.salesofgood.service.specification.WashingMachineSpecification;
import com.example.salesofgood.washingMachineDao.WashingMachineEntity;
import com.example.salesofgood.washingMachineDao.WashingMachineRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
@RequiredArgsConstructor
public class WashingMachineService {

    public final WashingMachineRepository washingMachineRepository;


    public WashingMachineDto getWashingMachine(Integer id){
        var washingMachineEntity =  washingMachineRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Washing Machine not found!!!"));
        return WashingMachineMapper.mapper.washingMachineEntityToDto(washingMachineEntity);
    }

    public void saveWashingMachine(WashingMachineEntity washingMachineEntity){
        washingMachineRepository.save(washingMachineEntity);
    }

    public void deleteWashingMachine(Integer id){
        washingMachineRepository.deleteById(id);
    }



    public WashingMachineDto updateWashingMachine(Integer id, WashingMachineEntity washingMachineEntity){

        var updateEntity = washingMachineRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Washing Machine not found!!!"));

        updateEntity.setPrice(washingMachineEntity.getPrice());

        washingMachineRepository.save(updateEntity);

        return WashingMachineMapper.mapper.washingMachineEntityToDto(washingMachineEntity);

    }


    public Page<WashingMachineDto> getWashingMachineFilter(Pageable pageable, FilterDto filterDto){

        var specification = Specification.where(
                new WashingMachineSpecification(filterDto.getBrand()));

        var washingMachine = washingMachineRepository.findAll(specification,pageable)
                .stream().map(WashingMachineMapper.mapper::washingMachineEntityToDto).collect(Collectors.toList());

        return new PageImpl<>(washingMachine,pageable,washingMachine.size());


    }

    public List<WashingMachineEntity> getFindByBrand(String brand){
        return washingMachineRepository.findByBrand(brand);
    }

}
