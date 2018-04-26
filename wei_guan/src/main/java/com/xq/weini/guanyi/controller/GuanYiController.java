package com.xq.weini.guanyi.controller;

import com.alibaba.fastjson.JSON;
import com.xq.weini.guanyi.dao.DemoRepository;
import com.xq.weini.guanyi.entity.po.DemoPO;
import com.xq.weini.guanyi.service.GyAddOrdService;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GuanYiController {

  @Autowired
  private GyAddOrdService gyAddOrdService;
  @Autowired
  private DemoRepository demoRepository;


  @RequestMapping(value = "/test/db", method = RequestMethod.GET)
  public String mocksql() {

    DemoPO demo = new DemoPO();
    demo.setCode("00001");
    demo.setName("demo");
    demo.setCreateTime(new Date());
    demoRepository.save(demo);

    List<DemoPO> list1 = demoRepository.findBySql();

    List<DemoPO> list2 = demoRepository.findByCuster(1l);

    List<DemoPO> list3 = demoRepository.findBySql(0,2);

    int rows = demoRepository.updateBySql(1l);

    return "";
  }




}
