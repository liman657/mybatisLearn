package com.learn.chapterfour.service;

import com.learn.chapterfour.dao.UserMapper;
import com.learn.chapterfour.domain.SysUser;
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

    public SysUser selectUserById(Long id){
        return userMapper.selectUserById(id);
    }

    public SysUser selectByUserNameAndEmail(String userName, String userEmail){
        return userMapper.selectByUserNameAndEmail(userName,userEmail);
    }

    public SysUser selectByDynamicSQL(String userName,String userEmail){
        return userMapper.selectByDynamicSQL(userName,userEmail);
    }

    public int updateByIdSelective(SysUser sysUser){
        return userMapper.updateByIdSelective(sysUser);
    }

    public int insertSysUserDynamicSQL(SysUser sysUser){
        return userMapper.insertSysUserDynamicSQL(sysUser);
    }

    public SysUser selectUserByIdOrUserName(Long id,String userName){
        return userMapper.selectUserByIdOrUserName(id,userName);
    }

    public SysUser selectByUser(String userName,String userEmail){
        return userMapper.selectByUser(userName,userEmail);
    }

    public int updateByIdSelectiveBySet(SysUser sysUser){
        return userMapper.updateByIdSelectiveBySet(sysUser);
    }

    public List<SysUser> selectByIdList(Long[] ids){
        return userMapper.selectByIdList(ids);
    }

    public int insertUsers(List<SysUser> users){
        return userMapper.insertUsers(users);
    }
}