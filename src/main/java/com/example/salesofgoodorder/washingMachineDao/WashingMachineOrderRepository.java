package com.example.salesofgoodorder.washingMachineDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WashingMachineOrderRepository extends JpaRepository<WashingMachineOrderEntity, Integer> {
}
