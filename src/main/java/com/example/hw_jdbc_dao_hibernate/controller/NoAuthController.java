package com.example.hw_jdbc_dao_hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoAuthController {
    @GetMapping("/noAuth")
    public String getHi() {
        return "Hello without authorization";
    }
}
