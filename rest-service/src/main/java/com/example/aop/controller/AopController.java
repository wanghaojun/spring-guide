package com.example.aop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class AopController {

    @GetMapping("/hello")
    public Object hello(){
        System.out.println("hello aop");
        return new String("hello aop");
    }

    @GetMapping("/hello1")
    public Object hello1(){
        System.out.println("hello1 aop");
        return new String("hello1 aop");
    }



}
