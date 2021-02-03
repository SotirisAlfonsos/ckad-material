package com.hello.world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

    @GetMapping("greeting")
    public String sendGreeting(@RequestParam(required = false) String name) {
        if (name == null) {
            name = "stranger";
        }
        return "Hello there " + name;
    }

    @GetMapping("version")
    public String sendVersion() {
        return "I am the new version v3";
    }
}
