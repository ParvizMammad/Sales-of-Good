package com.example.salesofgood.controller;

import com.example.salesofgood.model.FilterDto;
import com.example.salesofgood.model.NotebookDto;
import com.example.salesofgood.notebookDao.NotebookEntity;
import com.example.salesofgood.service.NotebookService;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notebook")
@Data
@RequiredArgsConstructor
public class NotebookController {

    private final NotebookService notebookService;

    @GetMapping("/{id}")
    public NotebookDto getNotebook(@PathVariable Integer id){
        return notebookService.getNotebook(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/save")
    ResponseEntity<String> saveNotebook(@Valid @RequestBody NotebookEntity notebookEntity){
        notebookService.saveNotebook(notebookEntity);
        return ResponseEntity.ok("Notebook is valid");
    }
    @DeleteMapping("/delete/{id}")
    public void deleteNotebook(@PathVariable Integer id){
        notebookService.deleteNotebook(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/update/{id}")
    public NotebookDto updateNotebook(@PathVariable Integer id, @RequestBody NotebookEntity notebookEntity){
        return notebookService.updateNotebook(id, notebookEntity);
    }

    @GetMapping("/page")
    public Page<NotebookDto> getNotebookFilter(Pageable pageable, FilterDto filterDto){
        return notebookService.getNotebookFilter(pageable,filterDto);
    }

    @GetMapping("/find/{brand}")
    public List<NotebookEntity> getFindByBrand(@PathVariable String brand){
        return notebookService.getFindByBrand(brand);
    }

}
