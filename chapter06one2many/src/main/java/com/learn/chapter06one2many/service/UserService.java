package com.learn.chapter06one2many.service;

import com.learn.chapter06one2many.dao.UserMapper;
import com.learn.chapter06one2many.domain.SysRole;
import com.learn.chapter06one2many.domain.SysUser;
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

    public List<SysUser> selectAllUserAndRoles(){
        return userMapper.selectAllUserAndRoles();
    }

    public List<SysUser> selectAllUserAndRolesAndPrivileges(){
        return userMapper.selectAllUserAndRolesAndPrivileges();
    }

    public List<SysUser> selectAllUserAndRolesSelect(Long id){
        return userMapper.selectAllUserAndRolesSelect(id);
    }

}
