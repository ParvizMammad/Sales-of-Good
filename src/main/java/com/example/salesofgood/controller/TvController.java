package com.example.salesofgood.controller;

import com.example.salesofgood.model.FilterDto;
import com.example.salesofgood.model.TvDto;
import com.example.salesofgood.service.TvService;
import com.example.salesofgood.tvDao.TvEntity;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tv")
public class TvController {

    private final TvService tvService;

    public TvController(TvService tvService) {
        this.tvService = tvService;
    }

    @GetMapping("/{id}")
    public TvDto getTv(@PathVariable Integer id){
        return tvService.getTvFilter(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/save")
    ResponseEntity<String> saveTv(@Valid @RequestBody TvEntity tvEntity){
        tvService.saveTv(tvEntity);
        return ResponseEntity.ok("Tv is valid");
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTv(@PathVariable Integer id){
        tvService.deleteTv(id);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/update/{id}")
    public TvDto updateTv(@PathVariable Integer id, @RequestBody TvEntity tvEntity){
        return tvService.updateTv(id, tvEntity);
    }


    @GetMapping("/page")
    public Page<TvDto> getTvFilter(Pageable pageable, FilterDto filterDto){
        return tvService.getTvFilter(pageable,filterDto);
    }

    @GetMapping("/find/{brand}")
    public List<TvEntity> getFindByBrand(@PathVariable String brand){
       return tvService.getFindByBrand(brand);
    }


}
