package com.org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SprindNewsApplication {
    public static void main(String[] args) {

        ApplicationContext context= SpringApplication.run(SprindNewsApplication.class, args);


    }
}