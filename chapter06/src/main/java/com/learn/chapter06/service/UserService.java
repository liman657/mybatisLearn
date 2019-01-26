package com.learn.chapter06.service;

import com.learn.chapter06.dao.UserMapper;
import com.learn.chapter06.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<SysUser> selectUserAndRoleByUserId(Long id){
        return userMapper.selectUserAndRoleByUserId(id);
    }

    public List<SysUser> selectUserAndRoleById2(Long id){
        return userMapper.selectUserAndRoleById2(id);
    }

    public List<SysUser> selectUserAndRoleByIdSelect(Long id){
        return userMapper.selectUserAndRoleByIdSelect(id);
    }

}
