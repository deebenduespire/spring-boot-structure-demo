package com.springboot.example.ms3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ms3", produces = {MediaType.APPLICATION_JSON_VALUE})
public class TestController03 {

  public TestController03() {
  }

  @GetMapping(path = "")
  public ResponseEntity<String> get() {
    return new ResponseEntity<String>("spring-boot-demo-ms3", HttpStatus.valueOf(HttpStatus.OK.value()));
  }
}
