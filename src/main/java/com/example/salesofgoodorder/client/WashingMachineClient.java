package com.example.salesofgoodorder.client;


import com.example.salesofgoodorder.model.client.WashingMachineDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Sales-Of-Good", url = "http://localhost:1203/washing-machine")
public interface WashingMachineClient {

    @GetMapping("/{id}")
    WashingMachineDto getWashingMachine(@PathVariable Integer id);


}
