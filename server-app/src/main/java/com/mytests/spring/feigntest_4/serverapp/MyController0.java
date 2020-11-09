package com.mytests.spring.feigntest_4.serverapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller0")
public class MyController0 {

    @GetMapping("/m1")
    public String m1() {
        return "m1";
    }

    @GetMapping("/m2")
    public String m2() {
        return "m2";
    }
}
