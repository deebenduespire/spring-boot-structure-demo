package com.springboot.example.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/apps", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AppController {

  public AppController() {
  }

  @GetMapping(path = "")
  public ResponseEntity<String> get() {
    return new ResponseEntity<String>("spring-boot-demo-app-clients", HttpStatus.valueOf(HttpStatus.OK.value()));
  }
}
