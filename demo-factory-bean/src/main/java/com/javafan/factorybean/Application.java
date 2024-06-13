package com.javafan.factorybean;

import com.javafan.mock.annotation.EnableMock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description TODO
 * @Author fzq
 * @Date 2024/6/11 11:04
 * @Version 1.0
 */
@SpringBootApplication
@EnableMock
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
