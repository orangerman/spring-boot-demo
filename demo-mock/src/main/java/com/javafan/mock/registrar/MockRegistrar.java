package com.javafan.mock.registrar;

import com.javafan.mock.annotation.EnableMock;
import com.javafan.mock.factory.MockEngineFactoryBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Map;


/**
 * @Author fzq
 * @Date 2024/6/11 11:43
 * @Version 1.0
 */
@Slf4j
public class MockRegistrar implements ImportBeanDefinitionRegistrar {


  /**
   * Register bean definitions as necessary based on the given annotation metadata of
   * the importing {@code @Configuration} class.
   * <p>Note that {@link BeanDefinitionRegistryPostProcessor} types may <em>not</em> be
   * registered here, due to lifecycle constraints related to {@code @Configuration}
   * class processing.
   *
   * @param metadata               annotation metadata of the importing class
   * @param beanDefinitionRegistry current bean definition registry
   */
  @Override
  public void registerBeanDefinitions(AnnotationMetadata metadata, @NonNull BeanDefinitionRegistry beanDefinitionRegistry) {
    Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(EnableMock.class.getName(), true);
    if (annotationAttributes != null) {
      boolean isTrue = (boolean) annotationAttributes.getOrDefault("value", false);
      if (isTrue) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(MockEngineFactoryBean.class);
        beanDefinitionRegistry.registerBeanDefinition("mockFactoryBean", builder.getBeanDefinition());
      }
    }
  }
}
