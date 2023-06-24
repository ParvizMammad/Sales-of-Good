package com.example.salesofgoodorder.service;


import com.example.salesofgoodorder.client.WashingMachineClient;
import com.example.salesofgoodorder.mapper.WashingMachineOrderMapper;
import com.example.salesofgoodorder.washingMachineDao.WashingMachineOrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class WashingMachineOrderService {

    private final WashingMachineOrderRepository washingMachineOrderRepository;
    private final WashingMachineClient washingMachineClient;

    public void createWashingMachineOrder(Integer id){
        log.info("ActionLog.createOrder.start for id {}", id);
        var washingMachine = washingMachineClient.getWashingMachine(id);
        var order = WashingMachineOrderMapper.mapper.mapWashingMachineOrderEntity(washingMachine);
        washingMachineOrderRepository.save(order);
        log.info("ActionLog.createOrder.end for id {}", id);
    }
}
