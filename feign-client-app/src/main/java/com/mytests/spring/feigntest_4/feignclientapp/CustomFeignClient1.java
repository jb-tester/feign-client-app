package com.mytests.spring.feigntest_4.feignclientapp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@FeignClient(contextId = "context")
public @interface CustomFeignClient1 {

  @AliasFor(attribute = "name", annotation = FeignClient.class)
  String client_name() default "";

  @AliasFor(attribute = "url", annotation = FeignClient.class)
  String client_url() default "";

}
