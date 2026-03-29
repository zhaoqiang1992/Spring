package com.example;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    /**
     *
     * @param method 要执行的目标对象的方法
     * @param args 要执行的目标对象的方法的参数
     * @param target 要执行的目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() +" 的" + method.getName() + " 被执行了");
    }
}
