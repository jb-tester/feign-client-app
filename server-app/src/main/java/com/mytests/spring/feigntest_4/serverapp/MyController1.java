package com.mytests.spring.feigntest_4.serverapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *
 * <p>Created by irina on 06.11.2020.</p>
 * <p>Project: feignTest3</p>
 * *
 */
@RestController
@RequestMapping("/controller1")
public class MyController1 {
    
    @GetMapping("/m1")
    public String m1(){
        return "m1";
    }
    @GetMapping("/m2")
    public String m2(){
        return "m2";
    }
}
