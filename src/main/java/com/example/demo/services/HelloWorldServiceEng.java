package com.example.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")
public class HelloWorldServiceEng implements HelloWorldService{
    @Override
    public String GetGreeting() {
        return "Hello world";
    }
}
