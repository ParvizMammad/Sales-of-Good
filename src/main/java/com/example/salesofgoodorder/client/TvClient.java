package com.example.salesofgoodorder.client;

import com.example.salesofgoodorder.model.client.TvDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Sales-Of-Good", url = "http://localhost:1203/tv")
public interface TvClient {

    @GetMapping("/{id}")
    TvDto getTv(@PathVariable Integer id);

}
