package com.example.demo;

import com.example.demo.controllers.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
       ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
       // System.out.println("kk l");
        Greeting grt = (Greeting) ctx.getBean("greeting");
        grt.sayHello();
    }

}
