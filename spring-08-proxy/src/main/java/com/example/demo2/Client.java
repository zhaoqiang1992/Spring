package com.example.demo2;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceImplProxy userServiceProxy = new UserServiceImplProxy();
        userServiceProxy.setUserServiceImpl(userService);
        userServiceProxy.add();
    }
}
