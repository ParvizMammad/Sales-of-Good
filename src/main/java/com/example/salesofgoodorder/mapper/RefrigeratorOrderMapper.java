package com.example.salesofgoodorder.mapper;

import com.example.salesofgoodorder.model.client.RefrigeratorDto;
import com.example.salesofgoodorder.refrigeratorDao.RefrigeratorOrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RefrigeratorOrderMapper {

    RefrigeratorOrderMapper mapper = Mappers.getMapper(RefrigeratorOrderMapper.class);


    @Mapping(target = "brand", source = "brand")
    @Mapping(target = "id", source = "id")
    RefrigeratorOrderEntity mapRefrigeratorOrderEntity(RefrigeratorDto refrigeratorDto);


}
