package com.example.salesofgood.mapper;

import com.example.salesofgood.model.TelephoneDto;
import com.example.salesofgood.telephoneDao.TelephoneEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TelephoneMapper {

    TelephoneMapper mapper = Mappers.getMapper(TelephoneMapper.class);


    TelephoneDto telephoneEntityToDto(TelephoneEntity telephoneEntity);



}
