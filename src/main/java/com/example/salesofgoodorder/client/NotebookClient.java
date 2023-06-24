package com.example.salesofgoodorder.client;

import com.example.salesofgoodorder.model.client.NotebookDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Sales-Of-Good", url = "http://localhost:1203/notebook")
public interface NotebookClient {

    @GetMapping("/{id}")
    NotebookDto getNotebook(@PathVariable Integer id);

}
