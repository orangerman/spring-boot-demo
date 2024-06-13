package com.javafan.mock.factory;

import java.util.Map;

/**
 * @Description Mock引擎
 * @Author fzq
 * @Date 2024/6/11 11:18
 * @Version 1.0
 */
public interface IMockEngine {

  Map<String,String> getMockByCode(String code);


}
