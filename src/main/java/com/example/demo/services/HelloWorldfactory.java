package com.example.demo.services;
@SuppressWarnings("all")
public class HelloWorldfactory {
    public HelloWorldService createHelloService(String lang){
        HelloWorldService service = switch (lang) {
            case "eng" -> new HelloWorldServiceEng();
            case "cze" -> new HelloWorldServiceCze();
            case "de" -> new HelloWorldServiceDe();
            case "ukr" -> new HelloWorldServiceUkr();
            default -> null;
        };

        return service;
    }
}
