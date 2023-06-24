package com.example.salesofgood.mapper;

import com.example.salesofgood.model.RefrigeratorDto;
import com.example.salesofgood.refrigeratorDao.RefrigeratorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RefrigeratorMapper {

    RefrigeratorMapper mapper = Mappers.getMapper(RefrigeratorMapper.class);

    RefrigeratorDto refrigeratorEntityToDto(RefrigeratorEntity refrigeratorEntity);

}
