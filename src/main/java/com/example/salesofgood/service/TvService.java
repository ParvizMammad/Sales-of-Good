package com.example.salesofgood.service;
import com.example.salesofgood.exception.NotFoundException;
import com.example.salesofgood.mapper.TvMapper;
import com.example.salesofgood.model.FilterDto;
import com.example.salesofgood.model.TvDto;
import com.example.salesofgood.service.specification.TvSpecification;
import com.example.salesofgood.tvDao.TvEntity;
import com.example.salesofgood.tvDao.TvRepository;
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
public class TvService {

    private final TvRepository tvRepository;

    public TvDto getTvFilter(Integer id){

        var tvEntity = tvRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Tv not found!!!"));
        return TvMapper.mapper.tvEntityToDto(tvEntity);

    }

    public void saveTv(TvEntity tvEntity){
        tvRepository.save(tvEntity);
    }

    public void deleteTv(Integer id){
        tvRepository.deleteById(id);
    }


    public TvDto updateTv(Integer id, TvEntity tvEntity){

        var updateEntity = tvRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Tv not found!!!"));
        updateEntity.setPrice(tvEntity.getPrice());

        tvRepository.save(updateEntity);

        return TvMapper.mapper.tvEntityToDto(tvEntity);

    }


    public Page<TvDto> getTvFilter(Pageable pageable, FilterDto filterDto){
        var specification = Specification.where(
                new TvSpecification(filterDto.getBrand()));
        var tv = tvRepository.findAll(specification, pageable).stream().
                map(TvMapper.mapper::tvEntityToDto).collect(Collectors.toList());
        return new PageImpl<>(tv, pageable,tv.size());
    }

    public List<TvEntity> getFindByBrand(String brand){

        return tvRepository.findByBrand(brand);

    }


}
