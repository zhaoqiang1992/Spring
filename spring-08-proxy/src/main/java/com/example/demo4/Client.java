package com.example.demo4;

import com.example.demo2.UserService;
import com.example.demo2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImpl userServiceImpl  = new UserServiceImpl();
        // 代理角色 不存在
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(userServiceImpl);

        UserService proxy = (UserService) proxyInvocationHandler.getProxy();

        proxy.add();

    }
}
