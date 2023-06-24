package com.example.salesofgood.telephoneDao;

import com.example.salesofgood.model.TelephoneDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TelephoneRepository extends JpaRepository<TelephoneEntity, Integer>,
        JpaSpecificationExecutor<TelephoneEntity> {


    List<TelephoneEntity> findByBrand(String brand);



}
