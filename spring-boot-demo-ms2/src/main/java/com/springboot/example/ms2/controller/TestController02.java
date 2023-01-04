package com.springboot.example.ms2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ms2", produces = {MediaType.APPLICATION_JSON_VALUE})
public class TestController02 {

  public TestController02() {
  }

  @GetMapping(path = "")
  public ResponseEntity<String> get() {
    return new ResponseEntity<String>("spring-boot-demo-ms2", HttpStatus.valueOf(HttpStatus.OK.value()));
  }
}
