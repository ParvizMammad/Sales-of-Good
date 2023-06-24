package com.example.salesofgoodorder.controller;

import com.example.salesofgoodorder.service.RefrigeratorOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/refrigerator-order/orders")
@RequiredArgsConstructor
public class RefrigeratorOrderController {

    private final RefrigeratorOrderService refrigeratorOrderService;


    @PostMapping
    public void createRefrigeratorOrder(@RequestBody Integer id){
        refrigeratorOrderService.createRefrigeratorOrder(id);
    }

}
