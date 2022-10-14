package com.student.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class home {

    @GetMapping("/")
    public  String test()
    {
        return "Server Started 👂👂 ...";
    }
}
