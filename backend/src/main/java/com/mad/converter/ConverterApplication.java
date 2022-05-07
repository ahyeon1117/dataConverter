package com.mad.converter;

import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConverterApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConverterApplication.class, args);
  }

  @PostConstruct
  public void test() {}
}
