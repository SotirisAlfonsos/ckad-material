package com.hello.world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("healthy")
    public String Healthy(){
        return "OK";
    }
}
