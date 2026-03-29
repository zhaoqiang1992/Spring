package com.example.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成得到代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();

        Object result = method.invoke(rent, args);
        hetong();
        fare();
        return result;
    }

    // 看房
    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    // 签合同
    public void hetong() {
        System.out.println("签合同");
    }

    // 收取中介费
    public void fare() {
        System.out.println("中介收取中介费");
    }
}
