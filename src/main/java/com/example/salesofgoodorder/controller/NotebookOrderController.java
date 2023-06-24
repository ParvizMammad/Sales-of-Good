package com.example.salesofgoodorder.controller;


import com.example.salesofgoodorder.service.NotebookOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notebook-order/orders")
public class NotebookOrderController {

    private final NotebookOrderService notebookOrderService;

    @PostMapping
    private void createNotebookOrder(@RequestBody Integer id){
        notebookOrderService.createNotebookOrder(id);
    }


}
