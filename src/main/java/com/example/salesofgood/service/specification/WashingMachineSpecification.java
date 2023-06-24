package com.example.salesofgood.service.specification;

import com.example.salesofgood.washingMachineDao.WashingMachineEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class WashingMachineSpecification implements Specification<WashingMachineEntity> {

    private final String brand;


    public WashingMachineSpecification(String brand) {
        this.brand = brand;
    }

    @Override
    public Predicate toPredicate(Root<WashingMachineEntity> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        return cb.equal(root.get("brand"), brand);
    }
}
