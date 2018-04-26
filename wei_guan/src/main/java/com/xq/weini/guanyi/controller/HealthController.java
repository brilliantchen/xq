package com.xq.weini.guanyi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HealthController {

  @Value("${demo.env:default}")
  private String env;

  @GetMapping(value = "/health")
  public String health() {
    log.info(env);
    return "health:"+env;
  }

}
