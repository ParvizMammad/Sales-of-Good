package com.example.salesofgoodorder.mapper;

import com.example.salesofgoodorder.model.client.TelephoneDto;
import com.example.salesofgoodorder.telephoneDao.TelephoneOrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TelephoneOrderMapper {

    TelephoneOrderMapper mapper = Mappers.getMapper(TelephoneOrderMapper.class);


    @Mapping(target = "brand", source = "brand")
    @Mapping(target = "id", source = "id")
    TelephoneOrderEntity mapTelephoneOrderEntity(TelephoneDto telephoneDto);


}
