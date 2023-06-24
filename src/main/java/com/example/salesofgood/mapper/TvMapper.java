package com.example.salesofgood.mapper;

import com.example.salesofgood.model.TvDto;
import com.example.salesofgood.tvDao.TvEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TvMapper {

    TvMapper mapper = Mappers.getMapper(TvMapper.class);


    TvDto tvEntityToDto(TvEntity tvEntity);


    TvEntity tvDtoToEntity(TvDto tvDto);
}
