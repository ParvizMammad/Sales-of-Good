package com.example.salesofgood.tvDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TvRepository extends JpaRepository<TvEntity,Integer>, JpaSpecificationExecutor<TvEntity> {

    List<TvEntity> findByBrand(String brand);

}
