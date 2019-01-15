package com.learn.chapterfour.service;

import com.learn.chapterfour.dao.UserMapper;
import com.learn.chapterfour.domain.SysUser;
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

    public SysUser selectByUserNameAndEmail(String userName, String userEmail){
        return userMapper.selectByUserNameAndEmail(userName,userEmail);
    }

    public SysUser selectByDynamicSQL(String userName,String userEmail){
        return userMapper.selectByDynamicSQL(userName,userEmail);
    }
}