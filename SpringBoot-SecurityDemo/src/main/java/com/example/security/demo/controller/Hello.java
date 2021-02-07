package com.example.security.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liwei
 * @create: 2021/2/5 0005
 * @description:
 **/
@RestController
public class Hello {
    @GetMapping("/hello")
    public String hello() {
        return "hello spring security";
    }
}
