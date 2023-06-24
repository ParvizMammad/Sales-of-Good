package com.example.salesofgoodorder.service;

import com.example.salesofgoodorder.client.TelephoneClient;
import com.example.salesofgoodorder.mapper.TelephoneOrderMapper;
import com.example.salesofgoodorder.telephoneDao.TelephoneOrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TelephoneOrderService {

    private final TelephoneOrderRepository telephoneOrderRepository;

    private final TelephoneClient telephoneClient;


    public void createTelephoneOrder(Integer id){
        log.info("ActionLog.createOrder.start for id {}", id);
        var telephone = telephoneClient.getTelephone(id);
        var order =   TelephoneOrderMapper.mapper.mapTelephoneOrderEntity(telephone);
        telephoneOrderRepository.save(order);
        log.info("ActionLog.createOrder.end for id {}", id);


    }
}