package com.example.salesofgoodorder.client;

import com.example.salesofgoodorder.model.client.RefrigeratorDto;
import com.example.salesofgoodorder.model.client.TelephoneDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Sales-Of-Good", url = "http://localhost:1203/telephone")
public interface TelephoneClient {

    @GetMapping("/{id}")
    TelephoneDto getTelephone(@PathVariable Integer id);

}
