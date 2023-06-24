package com.example.salesofgood.service.specification;

import com.example.salesofgood.telephoneDao.TelephoneEntity;
import com.example.salesofgood.tvDao.TvEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class TvSpecification implements Specification<TvEntity> {

    private final String brand;


    public TvSpecification(String brand) {
        this.brand = brand;
    }


    @Override
    public Predicate toPredicate(Root<TvEntity> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        return cb.equal(root.get("brand"), brand);
    }
}
