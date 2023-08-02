package com.example.demo;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Demo {

  @Value("${value}")
  private String value;

  @PostConstruct
  public void init() {
    log.info("VARIABLE {}", value);
  }
}
