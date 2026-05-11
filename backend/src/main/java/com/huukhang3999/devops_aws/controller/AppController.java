package com.huukhang3999.devops_aws.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AppController {
    @GetMapping("/ping")
    public Map<String, String> ping() {
        return Map.of(
            "status", "200", 
            "message", "Pong!");
    }

}
