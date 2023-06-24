package com.example.salesofgood.washingMachineDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WashingMachineRepository extends JpaRepository<WashingMachineEntity,Integer>,
        JpaSpecificationExecutor<WashingMachineEntity> {

    List<WashingMachineEntity> findByBrand(String brand);

}
