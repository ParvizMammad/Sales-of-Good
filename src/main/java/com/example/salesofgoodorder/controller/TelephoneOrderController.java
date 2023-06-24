package com.example.salesofgoodorder.controller;

import com.example.salesofgoodorder.service.TelephoneOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/telephone-order/orders")
public class TelephoneOrderController {

    private final TelephoneOrderService telephoneOrderService;

    @PostMapping
    public void createTelephoneOrder(@RequestBody Integer id){
        telephoneOrderService.createTelephoneOrder(id);

    }

}
