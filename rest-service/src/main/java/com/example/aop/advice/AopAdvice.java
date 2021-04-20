package com.example.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopAdvice {

    @Pointcut("execution (* com.example.aop.controller.*.*(..))")
    public void  pointCut(){

    }

    @Before("pointCut()")
    public void beforeAdvice(){
        System.out.println("beforeAdvice...");
    }

    @After("pointCut()")
    public void afterAdvice(){
        System.out.println("afterAdvice...");
    }

    @Around("pointCut()")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){

        String methodName = proceedingJoinPoint.getSignature().getName();
        System.out.println(methodName + "before");
        Object res = new Object();
        try {
            res =  proceedingJoinPoint.proceed();
        } catch (Throwable t) {
            t.printStackTrace();
        }
        System.out.println(methodName + "after");
        return res;
    }






}
