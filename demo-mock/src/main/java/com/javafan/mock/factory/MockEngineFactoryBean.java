package com.javafan.mock.factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Description TODO
 * @Author fzq
 * @Date 2024/6/11 11:22
 * @Version 1.0
 */
public class MockEngineFactoryBean implements FactoryBean<IMockEngine> {
  @Override
  public IMockEngine getObject() throws Exception {
    return new MockEngineImpl();
  }

  @Override
  public Class<?> getObjectType() {
    return IMockEngine.class;
  }
}
