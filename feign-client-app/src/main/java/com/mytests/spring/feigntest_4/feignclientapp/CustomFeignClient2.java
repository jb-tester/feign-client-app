package com.mytests.spring.feigntest_4.feignclientapp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@FeignClient(url = "http://localhost:8081/test4/app")
public @interface CustomFeignClient2 {

  @AliasFor(attribute = "name", annotation = FeignClient.class)
  String client_name() default "";

  

}
