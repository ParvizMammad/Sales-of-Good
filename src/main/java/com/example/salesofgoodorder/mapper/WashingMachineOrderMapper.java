package com.example.salesofgoodorder.mapper;

import com.example.salesofgoodorder.model.client.WashingMachineDto;
import com.example.salesofgoodorder.washingMachineDao.WashingMachineOrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WashingMachineOrderMapper {

    WashingMachineOrderMapper mapper = Mappers.getMapper(WashingMachineOrderMapper.class);

    @Mapping(target = "brand", source = "brand")
    @Mapping(target = "id", source = "id")
    WashingMachineOrderEntity mapWashingMachineOrderEntity(WashingMachineDto washingMachineDto);

}
