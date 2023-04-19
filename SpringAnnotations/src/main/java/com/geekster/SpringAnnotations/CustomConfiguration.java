package com.geekster.SpringAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ComponentScanTest"})
public class CustomConfiguration {

    @Bean("hitarth")
    public Student getStudent1(){
        System.out.println("Spring calll.. in config bean of student");
        return new Student("Hitarth");
    }
    @Bean("hada")
    public Student getStudent2(){
        System.out.println("Spring calll.. in config bean of student");
        return new Student("hada");
    }
}
