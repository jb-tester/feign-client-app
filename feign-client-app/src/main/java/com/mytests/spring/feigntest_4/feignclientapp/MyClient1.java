package com.mytests.spring.feigntest_4.feignclientapp;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * *
 * <p>Created by irina on 06.11.2020.</p>
 * <p>Project: feignTest3</p>
 * *
 */
@CustomFeignClient1(client_name = "client1", client_url = "http://localhost:8081/test4/app/controller1")
public interface MyClient1 {
    
    @GetMapping("/m1")
    String m1();

    @GetMapping("/m2")
    String m2();
}
