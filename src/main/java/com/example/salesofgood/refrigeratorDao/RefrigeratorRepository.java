package com.example.salesofgood.refrigeratorDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RefrigeratorRepository extends JpaRepository<RefrigeratorEntity,Integer>,
        JpaSpecificationExecutor<RefrigeratorEntity> {

    List<RefrigeratorEntity> findByBrand(String brand);
}
