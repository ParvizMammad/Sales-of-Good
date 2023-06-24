package com.example.salesofgoodorder.service;

import com.example.salesofgoodorder.client.TvClient;
import com.example.salesofgoodorder.mapper.TvOrderMapper;
import com.example.salesofgoodorder.tvDao.TvOrderRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TvOrderService {

    private final TvOrderRepository tvOrderRepository;

    private final TvClient tvClient;

    public void createTvOrder(Integer id){
        log.info("ActionLog.createOrder.start for id {}", id);

        var tv = tvClient.getTv(id);
        var order = TvOrderMapper.mapper.mapTvOrderEntity(tv);
        tvOrderRepository.save(order);
        log.info("ActionLog.createOrder.end for id {}", id);
    }

}
