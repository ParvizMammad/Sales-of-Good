package com.example.salesofgood.controller;

import com.example.salesofgood.model.FilterDto;
import com.example.salesofgood.model.RefrigeratorDto;
import com.example.salesofgood.refrigeratorDao.RefrigeratorEntity;
import com.example.salesofgood.service.RefrigeratorService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/refrigerator")
@Data
@RequiredArgsConstructor
public class RefrigeratorController {

    private final RefrigeratorService refrigeratorService;

    @GetMapping("/{id}")
    public RefrigeratorDto getRefrigerator(@PathVariable Integer id) {
        return refrigeratorService.getRefrigerator(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/save")
    ResponseEntity<String> saveRefrigerator(@RequestBody RefrigeratorEntity refrigeratorEntity) {
        refrigeratorService.saveRefrigerator(refrigeratorEntity);
        return ResponseEntity.ok("Refrigerator is valid");
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRefrigerator(@PathVariable Integer id) {
        refrigeratorService.deleteRefrigerator(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("update/{id}")
    public RefrigeratorDto updateRefrigerator(@PathVariable Integer id, @RequestBody RefrigeratorEntity refrigeratorEntity) {
        return refrigeratorService.updateRefrigerator(id, refrigeratorEntity);
    }


    @GetMapping("/page")
    public Page<RefrigeratorDto> getRefrigeratorFilter(Pageable pageable, FilterDto filterDto) {
        return refrigeratorService.getRefrigeratorFilter(pageable, filterDto);
    }

    @GetMapping("/find/{brand}")
    public List<RefrigeratorEntity> getFindByBrand(@PathVariable String brand) {
        return refrigeratorService.getFindByBrand(brand);
    }

}
