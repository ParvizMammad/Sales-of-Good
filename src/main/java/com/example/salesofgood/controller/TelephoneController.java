package com.example.salesofgood.controller;



import com.example.salesofgood.mapper.TelephoneMapper;
import com.example.salesofgood.model.TelephoneDto;
import com.example.salesofgood.model.FilterDto;
import com.example.salesofgood.service.TelephoneService;
import com.example.salesofgood.telephoneDao.TelephoneEntity;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/telephone")
@Data
@RequiredArgsConstructor
public class TelephoneController {

    private final TelephoneService telephoneService;


    @GetMapping("/{id}")
    public TelephoneDto getTelephone(@PathVariable Integer id){
        return telephoneService.getTelephone(id);
    }


//  @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/save")
    ResponseEntity<String> saveTelephone(@Valid @RequestBody TelephoneEntity telephoneEntity){
        telephoneService.saveTelephone(telephoneEntity);
        return ResponseEntity.ok("Telephone is valid");
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTelephone(@PathVariable Integer id){
        telephoneService.deleteTelephone(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/update/{id}")
    public TelephoneDto updateTelephone(@PathVariable Integer id,@RequestBody TelephoneEntity telephoneEntity){
        return telephoneService.updateTelephone(id, telephoneEntity);

    }

    @GetMapping("/page")
    public Page<TelephoneDto> getTelephoneFilter(
            Pageable pageable,
            FilterDto filterDto
           ){
        return telephoneService.getTelephoneFilter(pageable, filterDto);
    }

    @GetMapping("/find/{brand}")
    public List<TelephoneEntity> getFindByBrand(@PathVariable String brand){
        return telephoneService.getFindByBrand(brand);
    }





}
