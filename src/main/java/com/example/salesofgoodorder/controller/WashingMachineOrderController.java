package com.example.salesofgoodorder.controller;


import com.example.salesofgoodorder.service.WashingMachineOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/washing-machine-order/orders")
public class WashingMachineOrderController {

    private final WashingMachineOrderService washingMachineOrderService;

    @PostMapping
    public void createWashingMachineOrder(@RequestBody Integer id){
        washingMachineOrderService.createWashingMachineOrder(id);
    }

}
