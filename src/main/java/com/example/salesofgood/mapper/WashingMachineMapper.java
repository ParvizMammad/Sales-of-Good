package com.example.salesofgood.mapper;

import com.example.salesofgood.model.WashingMachineDto;
import com.example.salesofgood.washingMachineDao.WashingMachineEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WashingMachineMapper {

    WashingMachineMapper mapper = Mappers.getMapper(WashingMachineMapper.class);

    WashingMachineDto washingMachineEntityToDto(WashingMachineEntity washingMachineEntity);


}
