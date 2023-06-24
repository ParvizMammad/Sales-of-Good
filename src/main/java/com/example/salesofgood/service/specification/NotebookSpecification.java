package com.example.salesofgood.service.specification;

import com.example.salesofgood.notebookDao.NotebookEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class NotebookSpecification implements Specification<NotebookEntity> {

    private final String brand;


    public NotebookSpecification(String brand) {
        this.brand = brand;
    }

    @Override
    public Predicate toPredicate(Root<NotebookEntity> root, CriteriaQuery<?> query, CriteriaBuilder cb){
        return cb.equal(root.get("brand"),brand);
    }

}
