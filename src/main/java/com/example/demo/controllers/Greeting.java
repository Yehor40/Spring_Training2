package com.example.demo.controllers;

import com.example.demo.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Greeting {
    private HelloWorldService hls;

    @Autowired
    public void setHls(HelloWorldService hls) {
        this.hls = hls;
    }

    public String sayHello(){
        String greet = hls.GetGreeting();
        System.out.println(greet);
        return greet;
    }
}
