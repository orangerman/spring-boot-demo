package com.javafan.mock.annotation;

import com.javafan.mock.registrar.MockRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value =RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Import(MockRegistrar.class)
public @interface EnableMock {

    boolean value() default true;

}
