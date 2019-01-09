package com.learn.chapter02.service;

import com.learn.chapter02.dao.UserMapper;
import com.learn.chapter02.domain.SysRole;
import com.learn.chapter02.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void getUserById(Integer id){
        SysUser user = userMapper.getUserById(id);
        System.out.println(user);
    }

    public void selectAll(){
        List<SysUser> userList = userMapper.selectAll();
        for(SysUser user:userList){
            System.out.println(user.toString());
        }
    }

    public List<SysRole> selectRolesByUserId(Integer userId){
        List<SysRole> sysRoles = userMapper.selectRolesByUserId(userId);
        System.out.println(sysRoles.size());
        return sysRoles;
    }
}