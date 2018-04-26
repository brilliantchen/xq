package com.xq.weini.guanyi.task;

import com.xq.weini.guanyi.comm.util.DateUtil;
import com.xq.weini.guanyi.service.GyAddOrdService;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderSyncTask {

  @Autowired
  private GyAddOrdService gyAddOrdService;

  @Scheduled(fixedRate = 2 * 1000)
  public void mockGyOrder(){
    log.info("task:"+ DateUtil.dateToString(new Date()));
    gyAddOrdService.mockGyOrder();
  }


}
