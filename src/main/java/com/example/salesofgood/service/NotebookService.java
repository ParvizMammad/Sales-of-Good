package com.example.salesofgood.service;

import com.example.salesofgood.exception.NotFoundException;
import com.example.salesofgood.mapper.NotebookMapper;
import com.example.salesofgood.model.FilterDto;
import com.example.salesofgood.model.NotebookDto;
import com.example.salesofgood.notebookDao.NotebookEntity;
import com.example.salesofgood.notebookDao.NotebookRepository;
import com.example.salesofgood.service.specification.NotebookSpecification;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
@RequiredArgsConstructor
public class NotebookService {

    private final NotebookRepository notebookRepository;


    public NotebookDto getNotebook(Integer id){
        var notebookEntity = notebookRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Not found notebook!!!"));
        return NotebookMapper.mapper.notebookEntityToDto(notebookEntity);
    }

    public void saveNotebook(NotebookEntity notebookEntity){
        notebookRepository.save(notebookEntity);
    }

    public void deleteNotebook(Integer id){
        notebookRepository.deleteById(id);
    }

    public NotebookDto updateNotebook(Integer id, NotebookEntity notebookEntity){

        var updateEntity = notebookRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Notebook not found!!!"));
        updateEntity.setPrice(notebookEntity.getPrice());

        notebookRepository.save(updateEntity);
       return NotebookMapper.mapper.notebookEntityToDto(notebookEntity);
    }

    public Page<NotebookDto> getNotebookFilter(Pageable pageable, FilterDto filterDto){

        var specification = Specification.where(
                new NotebookSpecification(filterDto.getBrand()));

        var notebook = notebookRepository.findAll(specification,pageable).stream()
                .map(NotebookMapper.mapper::notebookEntityToDto).collect(Collectors.toList());

    return new PageImpl<>(notebook, pageable,notebook.size());

    }

    public List<NotebookEntity> getFindByBrand(String brand){
        return notebookRepository.findByBrand(brand);
    }


}
