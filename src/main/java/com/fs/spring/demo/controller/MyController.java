package com.fs.spring.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/{name}")
    public String greet(@PathVariable String name){
        return "Hello " + name;
    }
}
