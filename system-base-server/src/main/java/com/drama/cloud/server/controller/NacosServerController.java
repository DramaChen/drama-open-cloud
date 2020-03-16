package com.drama.cloud.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosServerController {

    @GetMapping("/user")
    public String nacos(){
        return "hello nacos server";
    }
}
