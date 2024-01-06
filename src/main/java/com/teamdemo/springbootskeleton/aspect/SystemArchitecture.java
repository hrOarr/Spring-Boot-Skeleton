package com.teamdemo.springbootskeleton.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SystemArchitecture {

    @Pointcut("execution(* com.teamdemo.springbootskeleton.controller.*.*(..))")
    public void executingAnyController() {}
}
