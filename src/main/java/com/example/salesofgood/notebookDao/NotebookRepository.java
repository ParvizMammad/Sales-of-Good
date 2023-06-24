package com.example.salesofgood.notebookDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotebookRepository extends JpaRepository<NotebookEntity,Integer>,
        JpaSpecificationExecutor<NotebookEntity> {

    List<NotebookEntity> findByBrand(String brand);

}
