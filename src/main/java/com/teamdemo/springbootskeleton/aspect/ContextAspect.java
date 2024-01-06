package com.teamdemo.springbootskeleton.aspect;

import com.teamdemo.springbootskeleton.context.LoggingContext;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Aspect
@Slf4j
@RequiredArgsConstructor
public class ContextAspect {

    @Before("com.teamdemo.springbootskeleton.aspect.SystemArchitecture.executingAnyController()")
    private void setLoggingContextAndLogRequest(JoinPoint joinPoint)  {
        // write your own custom logic
//        if (joinPoint.getArgs().length > 1 && joinPoint.getArgs()[1] instanceof String id) {
//            LoggingContext.set(id + ":" + UUID.randomUUID());
//        }
        if (joinPoint.getArgs().length > 0 && joinPoint.getArgs()[0] instanceof HttpServletRequest request) {
            log.info("{}: {}: API Start", LoggingContext.get(), request.getRequestURI());
        }
    }

    @AfterReturning("com.teamdemo.springbootskeleton.aspect.SystemArchitecture.executingAnyController()")
    private void afterReturning() {
        log.info("{}: End of API call", LoggingContext.get());
        LoggingContext.clear();
    }
}
