package com.teamdemo.springbootskeleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBootSkeletonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSkeletonApplication.class, args);
    }

}
