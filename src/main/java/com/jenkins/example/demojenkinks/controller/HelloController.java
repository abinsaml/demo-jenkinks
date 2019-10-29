package com.jenkins.example.demojenkinks.controller;

import com.jenkins.example.demojenkinks.DemoJenkinksApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    public static Logger logger= LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/hello")
    public String hello(){
        return "Hello From Jenkins";
    }
}
