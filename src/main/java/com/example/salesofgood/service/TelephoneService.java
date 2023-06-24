package com.example.salesofgood.service;


import com.example.salesofgood.exception.NotFoundException;
import com.example.salesofgood.mapper.TelephoneMapper;
import com.example.salesofgood.model.TelephoneDto;
import com.example.salesofgood.model.FilterDto;
import com.example.salesofgood.service.specification.TelephoneSpecification;
import com.example.salesofgood.telephoneDao.TelephoneEntity;
import com.example.salesofgood.telephoneDao.TelephoneRepository;
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
public class TelephoneService {
    private final TelephoneRepository telephoneRepository;

    public TelephoneDto getTelephone(Integer id) {


        var telephoneEntity = telephoneRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Telephone not found!!!"));
        return TelephoneMapper.mapper.telephoneEntityToDto(telephoneEntity);
    }


    public void  saveTelephone(TelephoneEntity telephoneEntity)  {

       telephoneRepository.save(telephoneEntity);

    }

    public void deleteTelephone(Integer id) {
        telephoneRepository.deleteById(id);
    }

    public TelephoneDto updateTelephone(Integer id, TelephoneEntity telephoneEntity) {
        var updateEntity = telephoneRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Telephone not found!!!"));
        updateEntity.setPrice(telephoneEntity.getPrice());

        telephoneRepository.save(updateEntity);
        return TelephoneMapper.mapper.telephoneEntityToDto(telephoneEntity);

    }

    public Page<TelephoneDto> getTelephoneFilter(Pageable pageable, FilterDto filterDto) {
        var specification = Specification.where(
                new TelephoneSpecification(filterDto.getBrand())
        );
        var telephone = telephoneRepository.findAll(specification, pageable).stream().
                map(TelephoneMapper.mapper::telephoneEntityToDto).collect(Collectors.toList());
        return new PageImpl<>(telephone, pageable, telephone.size());
    }


    public List<TelephoneEntity> getFindByBrand(String brand){
       return telephoneRepository.findByBrand(brand);
    }


}
