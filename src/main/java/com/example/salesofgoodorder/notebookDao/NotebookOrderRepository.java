package com.example.salesofgoodorder.notebookDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotebookOrderRepository extends JpaRepository<NotebookOrderEntity, Integer> {
}
