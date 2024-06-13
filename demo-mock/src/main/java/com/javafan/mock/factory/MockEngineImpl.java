package com.javafan.mock.factory;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author fzq
 * @Date 2024/6/11 11:23
 * @Version 1.0
 */
public class MockEngineImpl implements IMockEngine {
  @Override
  public Map<String,String> getMockByCode(String code) {
    Map<String, String> result = new HashMap<>();
    result.put("code", code);
    return result;
  }
}
