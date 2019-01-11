package com.learn.chapter02.service;

import com.learn.chapter02.dao.UserMapper;
import com.learn.chapter02.domain.SysRole;
import com.learn.chapter02.domain.SysRoleExtend;
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

    public int insertUser(SysUser user){
        return userMapper.insertUser(user);
    }

    /**
     * 使用jdbc的方式返回主键自增的值
     * @param user
     * @return
     */
    public int insertUserTow(SysUser user){
        return userMapper.insertUserTwo(user);
    }

    /**
     * 使用selectKey的方式返回主键自增的值
     * @param user
     * @return
     */
    public int insertUserThird(SysUser user){
        return userMapper.insertUserThird(user);
    }
}