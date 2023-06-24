package com.example.salesofgood.service.specification;

import com.example.salesofgood.refrigeratorDao.RefrigeratorEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class RefrigeratorSpecification implements Specification<RefrigeratorEntity> {

    private final String brand;


    public RefrigeratorSpecification(String brand) {
        this.brand = brand;
    }


    @Override
    public Predicate toPredicate(Root<RefrigeratorEntity> root, CriteriaQuery<?> query, CriteriaBuilder cb){
        return cb.equal(root.get("brand"), brand);
    }


}
