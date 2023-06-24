package com.example.salesofgood.service;

import com.example.salesofgood.exception.NotFoundException;
import com.example.salesofgood.mapper.RefrigeratorMapper;
import com.example.salesofgood.model.FilterDto;
import com.example.salesofgood.model.RefrigeratorDto;
import com.example.salesofgood.refrigeratorDao.RefrigeratorEntity;
import com.example.salesofgood.refrigeratorDao.RefrigeratorRepository;
import com.example.salesofgood.service.specification.RefrigeratorSpecification;
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
public class RefrigeratorService {

    private final RefrigeratorRepository refrigeratorRepository;

    public RefrigeratorDto getRefrigerator(Integer id){
        var refrigeratorEntity = refrigeratorRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Refrigerator not found!!!"));
        return RefrigeratorMapper.mapper.refrigeratorEntityToDto(refrigeratorEntity);
    }

    public void saveRefrigerator(RefrigeratorEntity refrigeratorEntity){
        refrigeratorRepository.save(refrigeratorEntity);
    }

    public void deleteRefrigerator(Integer id){
        refrigeratorRepository.deleteById(id);
    }


    public RefrigeratorDto updateRefrigerator(Integer id, RefrigeratorEntity refrigeratorEntity){
        var updateEntity = refrigeratorRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Refrigerator not found!!!"));

        updateEntity.setPrice(refrigeratorEntity.getPrice());
        refrigeratorRepository.save(updateEntity);

        return RefrigeratorMapper.mapper.refrigeratorEntityToDto(refrigeratorEntity);

    }

    public Page<RefrigeratorDto> getRefrigeratorFilter(Pageable pageable, FilterDto filterDto){

        var specification = Specification.where(
                new RefrigeratorSpecification(filterDto.getBrand()));
        var refrigerator = refrigeratorRepository.findAll(specification,pageable).
                stream().map(RefrigeratorMapper.mapper::refrigeratorEntityToDto).collect(Collectors.toList());

        return new  PageImpl<>(refrigerator,pageable,refrigerator.size());

    }

    public List<RefrigeratorEntity> getFindByBrand(String brand){
        return refrigeratorRepository.findByBrand(brand);
    }


}
