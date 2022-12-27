package com.example.demo.controllers;

import com.example.demo.services.HelloWorldService;
import com.example.demo.services.HelloWorldServiceDe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


public class Greeting {
    private HelloWorldService hls;
    private HelloWorldService hlsde;
    private  HelloWorldService hlsu;
 @Autowired
 @Qualifier("ukraine")
    public void setHlsu(HelloWorldService hlsu) {
        this.hlsu = hlsu;
    }

    @Autowired
    public void setHls(HelloWorldService hls) {
        this.hls = hls;
    }
    @Autowired
    @Qualifier("german")
    public void setHlsd(HelloWorldService hlsd) {
        this.hlsde = hlsd;
    }

    public String sayHello(){
        String greet = hls.GetGreeting();
        System.out.println(hlsde.GetGreeting());
        System.out.println(hlsu.GetGreeting());
        System.out.println(greet);
        return greet;
    }
}
