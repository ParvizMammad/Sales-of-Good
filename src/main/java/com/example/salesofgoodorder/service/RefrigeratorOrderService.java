package com.example.salesofgoodorder.service;

import com.example.salesofgoodorder.client.RefrigeratorClient;
import com.example.salesofgoodorder.mapper.RefrigeratorOrderMapper;
import com.example.salesofgoodorder.refrigeratorDao.RefrigeratorOrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RefrigeratorOrderService {

    private final RefrigeratorOrderRepository refrigeratorOrderRepository;

    private final RefrigeratorClient refrigeratorClient;


    public void createRefrigeratorOrder(Integer id){
        log.info("ActionLog.createOrder.start for id {}", id);
        var refrigerator = refrigeratorClient.getRefrigerator(id);
        var order = RefrigeratorOrderMapper.mapper.mapRefrigeratorOrderEntity(refrigerator);
        refrigeratorOrderRepository.save(order);
        log.info("ActionLog.createOrder.end for id {}", id);



    }


}
