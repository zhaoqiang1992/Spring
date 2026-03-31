package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.example") // 没有 @Service、@Component 这类注解,完全靠 @Bean 方法一个个声明,不需要扫描；
@Import(Config2.class)
public class config {

    @Bean
    public User getUser(){
        return new User();
    }
}
