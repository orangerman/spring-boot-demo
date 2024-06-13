package com.javafan.mock.annotation;

import java.lang.annotation.*;

@Target(value = {ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Mock {

}
