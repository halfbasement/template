package com.sik.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemplateApplication {

    public static void main(String[] args) {
        System.out.println("args = " + args);
        
        SpringApplication.run(TemplateApplication.class, args);
    }

}
