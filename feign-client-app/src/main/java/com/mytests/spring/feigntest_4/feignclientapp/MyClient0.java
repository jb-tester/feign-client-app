package com.mytests.spring.feigntest_4.feignclientapp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * *
 * <p>Created by irina on 06.11.2020.</p>
 * <p>Project: feignTest3</p>
 * *
 */
@FeignClient(name = "client0", url = "http://localhost:8081/test4/app")
public interface MyClient0 {
    
    @GetMapping("/controller0/m1")
    String m1();

    @GetMapping("/controller0/m2")
    String m2();
}
