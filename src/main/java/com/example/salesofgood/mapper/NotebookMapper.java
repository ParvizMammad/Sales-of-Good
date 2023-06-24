package com.example.salesofgood.mapper;

import com.example.salesofgood.model.NotebookDto;
import com.example.salesofgood.notebookDao.NotebookEntity;
import com.example.salesofgood.notebookDao.NotebookRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NotebookMapper {

    NotebookMapper mapper = Mappers.getMapper(NotebookMapper.class);


    NotebookDto notebookEntityToDto(NotebookEntity notebookEntity);


}
