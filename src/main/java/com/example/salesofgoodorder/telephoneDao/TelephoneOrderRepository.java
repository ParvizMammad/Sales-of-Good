package com.example.salesofgoodorder.telephoneDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelephoneOrderRepository extends JpaRepository<TelephoneOrderEntity,Integer> {

}
