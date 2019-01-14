package com.learn.chapter03.service;

import com.learn.chapter03.dao.UserMapper;
import com.learn.chapter03.domain.SysRole;
import com.learn.chapter03.domain.SysUser;
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

    public void getUserById(Integer id) {
        SysUser user = userMapper.getUserById(id);
        System.out.println(user);
    }

    public void selectAll() {
        List<SysUser> userList = userMapper.selectAll();
        for (SysUser user : userList) {
            System.out.println(user.toString());
        }
    }

    public List<SysRole> selectRolesByUserId(Integer userId) {
        List<SysRole> sysRoles = userMapper.selectRolesByUserId(userId);
        System.out.println(sysRoles.size());
        return sysRoles;
    }

    public int insertUser(SysUser user) {
        return userMapper.insertUser(user);
    }

    /**
     * 使用jdbc的方式返回主键自增的值
     *
     * @param user
     * @return
     */
    public int insertUserTow(SysUser user) {
        return userMapper.insertUserTwo(user);
    }

    /**
     * 使用selectKey的方式返回主键自增的值
     *
     * @param user
     * @return
     */
    public int insertUserThird(SysUser user) {
        return userMapper.insertUserThird(user);
    }

    /**
     * update用法
     *
     * @param id
     * @return
     */
    public int updateUserById(Integer id) {
        SysUser sysUser = userMapper.getUserById(id);
        sysUser.setUserName("updateTest");
        return userMapper.updateUserById(sysUser);
    }

    /**
     * delete用法
     *
     * @param id
     * @return
     */
    public int deleteUserById(Integer id) {
        SysUser sysUser = userMapper.getUserById(id);
        return userMapper.deleteUserById(sysUser);
    }

    public List<SysRole> selectRolesByUserIdAndRoleEnabled(Long userId, Integer enabled) {
        return userMapper.selectRolesByUserIdAndRoleEnabled(userId, enabled);
    }
}