package com.example.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// 方式三：使用注解方式实现AOP
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.example.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("===========方法执行前===========");
    }

    @After("execution(* com.example.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("===========方法执行后===========");
    }

    @Around("execution(* com.example.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");

        Signature signature = jp.getSignature();
        System.out.println("signature"+signature.toString());

        Object proceed = jp.proceed();

        System.out.println("环绕后");

        System.out.println(proceed);

    }
}
