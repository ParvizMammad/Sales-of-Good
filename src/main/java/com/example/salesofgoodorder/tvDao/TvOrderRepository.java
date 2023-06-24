package com.example.salesofgoodorder.tvDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TvOrderRepository extends JpaRepository<TvOrderEntity, Integer> {
}
