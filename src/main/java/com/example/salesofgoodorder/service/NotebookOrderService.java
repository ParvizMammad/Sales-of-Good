package com.example.salesofgoodorder.service;


import com.example.salesofgoodorder.client.NotebookClient;
import com.example.salesofgoodorder.mapper.NotebookOrderMapper;
import com.example.salesofgoodorder.notebookDao.NotebookOrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotebookOrderService {

    private final NotebookOrderRepository notebookOrderRepository;

    private final NotebookClient notebookClient;


    public void createNotebookOrder(Integer id){
        log.info("ActionLog.createOrder.start for id {}", id);
        var notebook = notebookClient.getNotebook(id);
        var order = NotebookOrderMapper.mapper.mapNotebookOrderEntity(notebook);
        notebookOrderRepository.save(order);
        log.info("ActionLog.createOrder.end for id {}", id);
    }

}
