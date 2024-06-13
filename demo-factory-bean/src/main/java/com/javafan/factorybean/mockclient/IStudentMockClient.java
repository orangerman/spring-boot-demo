package com.javafan.factorybean.mockclient;

import com.javafan.mock.annotation.MockClient;
import com.javafan.mock.annotation.MockMethod;

import java.util.Map;

/**
 * @Description TODO
 * @Author fzq
 * @Date 2024/6/11 11:48
 * @Version 1.0
 */
@MockClient
public interface IStudentMockClient {

  @MockMethod(value = "student")
  Map<String, String> getStudentByCode(String code);
}
