package com.example.springdemo;

import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {

    @Bean
    public Course course() {
        return new Course("Spring Framework Fundamentals");
    }

    @Bean
    public Student student() {
        return new Student(course());
    }
}
