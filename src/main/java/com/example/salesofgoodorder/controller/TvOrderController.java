package com.example.salesofgoodorder.controller;

import com.example.salesofgoodorder.service.TvOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tv-order/orders")
public class TvOrderController {

    private final TvOrderService tvOrderService;

    @PostMapping
    public void createTvOrder(@RequestBody Integer id){
        tvOrderService.createTvOrder(id);
    }

}
