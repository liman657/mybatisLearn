package com.learn.mybatislearn.service;

import com.learn.mybatislearn.dao.UserMapper;
import com.learn.mybatislearn.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * autor:liman
 * comment:
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void getUserById(Integer id){
        User user = userMapper.getUserById(id);
        System.out.println(user);
    }
}