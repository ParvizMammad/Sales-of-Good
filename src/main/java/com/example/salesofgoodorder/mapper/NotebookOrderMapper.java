package com.example.salesofgoodorder.mapper;

import com.example.salesofgoodorder.model.client.NotebookDto;
import com.example.salesofgoodorder.notebookDao.NotebookOrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NotebookOrderMapper {

    NotebookOrderMapper mapper = Mappers.getMapper(NotebookOrderMapper.class);

    @Mapping(target = "brand", source = "brand")
    @Mapping(target = "id", source = "id")
    NotebookOrderEntity mapNotebookOrderEntity(NotebookDto notebookDto);


}
