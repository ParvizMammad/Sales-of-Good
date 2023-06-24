package com.example.salesofgoodorder.refrigeratorDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefrigeratorOrderRepository extends JpaRepository<RefrigeratorOrderEntity, Integer> {
}
