package com.example.demo2;

public class UserServiceImplProxy implements UserService {
    public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    private UserServiceImpl userServiceImpl;

    @Override
    public void add() {
        log("add");
        userServiceImpl.add();
    }

    @Override
    public void delete() {
        log("delete");
        userServiceImpl.delete();
    }

    @Override
    public void update() {
        log("update");
        userServiceImpl.update();
    }

    @Override
    public void query() {
        log("query");
        userServiceImpl.query();
    }

    public void log(String msg) {
        System.out.println("[Debug]使用了" + msg + "方法");
    }
}
