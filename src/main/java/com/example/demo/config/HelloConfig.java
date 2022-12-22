package com.example.demo.config;

import com.example.demo.services.HelloWorldService;
import com.example.demo.services.HelloWorldServiceCze;
import com.example.demo.services.HelloWorldServiceEng;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {
    @Bean
    @Profile("english")
    public HelloWorldService hlse(){
        return new HelloWorldServiceEng();
    }
    @Bean
    @Profile("czech")
    public HelloWorldService hlsc(){
        return new HelloWorldServiceCze();
    }
}
