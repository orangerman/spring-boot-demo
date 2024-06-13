package com.javafan.factorybean.controller;

import com.javafan.factorybean.mockclient.IStudentMockClient;
import com.javafan.mock.factory.IMockEngine;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Description Mock控制器
 * @Author fzq
 * @Date 2024/6/11 11:18
 * @Version 1.0
 */
@RestController
@RequestMapping("mock")
@RequiredArgsConstructor
public class MockController {

  private final IMockEngine mockEngine;

  //private final IStudentMockClient studentMockClient;

  @GetMapping("getData/{code}")
  public Map<String,String> getData(@PathVariable String code){
    return mockEngine.getMockByCode(code);
  }

  //@GetMapping("getStudent/{code}")
  //public Map<String,String> getStudent(@PathVariable String code){
  //  return studentMockClient.getStudentByCode(code);
  //}


}
