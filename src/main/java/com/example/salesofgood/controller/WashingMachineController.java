package com.example.salesofgood.controller;

import com.example.salesofgood.model.FilterDto;
import com.example.salesofgood.model.WashingMachineDto;
import com.example.salesofgood.service.WashingMachineService;
import com.example.salesofgood.washingMachineDao.WashingMachineEntity;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/washing-machine")
@Data
@RequiredArgsConstructor
public class WashingMachineController {

    private final WashingMachineService washingMachineService;

    @GetMapping("/{id}")
    public WashingMachineDto getWashingMachine(@PathVariable Integer id){
        return washingMachineService.getWashingMachine(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/save")
    ResponseEntity<String> saveWashingMachine(@RequestBody WashingMachineEntity washingMachineEntity){
        washingMachineService.saveWashingMachine(washingMachineEntity);
        return ResponseEntity.ok("Washing Machine is valid");
    }
    @DeleteMapping("/delete/{id}")
    public void deleteWashingMachine(@PathVariable Integer id){
        washingMachineService.deleteWashingMachine(id);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/update/{id}")
    public WashingMachineDto updateWashingMachine(@PathVariable Integer id,@RequestBody WashingMachineEntity washingMachineEntity){
        return washingMachineService.updateWashingMachine(id, washingMachineEntity);
    }

    @GetMapping("/page")
    public Page<WashingMachineDto> getWashingMachineFilter(Pageable pageable, FilterDto filterDto){
        return washingMachineService.getWashingMachineFilter(pageable,filterDto);
    }
    @GetMapping("/find/{brand}")
    public List<WashingMachineEntity> getFindByBrand(@PathVariable String brand){
        return washingMachineService.getFindByBrand(brand);
    }


}
