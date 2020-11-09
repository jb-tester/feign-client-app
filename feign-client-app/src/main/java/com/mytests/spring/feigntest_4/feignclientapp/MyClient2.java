package com.mytests.spring.feigntest_4.feignclientapp;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * *
 * <p>Created by irina on 06.11.2020.</p>
 * <p>Project: feignTest3</p>
 * *
 */
@CustomFeignClient2(client_name = "client2")
public interface MyClient2 {
    
    
    
    @GetMapping("/controller2/m1")
    String m1();

    @GetMapping("/controller2/m2")
    String m2();
}
