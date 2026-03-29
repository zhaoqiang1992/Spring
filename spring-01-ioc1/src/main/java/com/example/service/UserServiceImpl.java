package com.example.service;

import com.example.dao.UserDao;
import com.example.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    // 利用set方法，动态控制dao的实现类
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
