package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.example")
@Import(Config2.class)
public class config {

    @Bean
    public User getUser(){
        return new User();
    }
}
