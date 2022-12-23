package com.example.demo.config;

import com.example.demo.services.HelloWorldService;
import com.example.demo.services.HelloWorldServiceCze;
import com.example.demo.services.HelloWorldServiceEng;
import com.example.demo.services.HelloWorldfactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {
   @Bean
   public HelloWorldfactory helloWorldfactory(){
       return new HelloWorldfactory();
   }
    @Bean
    @Profile("english")
    @Primary
    public HelloWorldService hlse(HelloWorldfactory factory){
        return  factory.createHelloService("en");
    }
    @Bean
    @Profile("czech")
    @Primary
    public HelloWorldService hlsc(HelloWorldfactory factory){
        return  factory.createHelloService("cze");
    }
    @Bean(name="german")
    //@Profile("german")
    public HelloWorldService hlsd(HelloWorldfactory factory){
        return  factory.createHelloService("de");
    }
    @Bean
    //@Profile("ukraine")
    public HelloWorldService hlsu(HelloWorldfactory factory){
        return  factory.createHelloService("ukr");
    }
}
