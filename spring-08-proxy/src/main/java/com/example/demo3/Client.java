package com.example.demo3;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();
        // 代理角色 现在没有
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        // 通过调用程序处理角色，来处理我们要调用的接口对象
        proxyInvocationHandler.setRent(host);
        Rent rent = (Rent) proxyInvocationHandler.getProxy();// 这里的proxy是动态生成的，我们并没有写
        rent.rent();
    }
}
