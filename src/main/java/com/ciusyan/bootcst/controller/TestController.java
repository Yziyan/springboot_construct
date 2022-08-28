package com.ciusyan.bootcst.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests")
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Hello World!!!";
    }
}
