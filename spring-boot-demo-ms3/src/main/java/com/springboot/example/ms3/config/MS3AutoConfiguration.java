package com.springboot.example.ms3.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springboot")
public class MS3AutoConfiguration implements ApplicationContextAware {

  public MS3AutoConfiguration() {
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
  }
}
