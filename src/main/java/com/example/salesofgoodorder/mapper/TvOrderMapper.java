package com.example.salesofgoodorder.mapper;

import com.example.salesofgoodorder.model.client.TvDto;
import com.example.salesofgoodorder.tvDao.TvOrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TvOrderMapper {

    TvOrderMapper mapper = Mappers.getMapper(TvOrderMapper.class);

    @Mapping(target = "brand", source = "brand")
    @Mapping(target = "id", source = "id")
    TvOrderEntity mapTvOrderEntity(TvDto tvDto);

}
