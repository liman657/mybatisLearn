package com.learn.chapterfour.UserTest;

import com.learn.chapterfour.domain.SysUser;
import com.learn.chapterfour.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * autor:liman
 * comment:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSelectSysUserByUserNameAndEmail(){
        String userName = "admin";
        String userEmail = "admin@mybatis.tk";
        SysUser sysUser = userService.selectByUserNameAndEmail(userName,userEmail);
        System.out.println(sysUser);
    }

    @Test
    public void testselectByDynamicSQL(){
        String userName = "admin";
        String userEmail = "admin@mybatis.tk";
        SysUser sysUser = userService.selectByDynamicSQL(userName,userEmail);
        System.out.println(sysUser);
    }

    @Test
    public void testUpdateByIdSelective(){
        Long id = 2L;
        SysUser sysUser = userService.selectUserById(id);
        sysUser.setUserInfo("updateInfo");
        userService.updateByIdSelective(sysUser);
    }

    @Test
    public void testInsertSysUserDynamicSQL(){
        SysUser sysUser = new SysUser();
        sysUser.setId(3L);
        sysUser.setUserInfo("insert info");
        sysUser.setCreateTime(new Date());
        sysUser.setUserEmail("inserttest@test.com");
        sysUser.setUserName("insertTest");
        sysUser.setUserPassword("insertPassword");

        int i = userService.insertSysUserDynamicSQL(sysUser);
        System.out.println(sysUser.getId());
        System.out.println(i);
    }

    @Test
    public void testSelectUserByIdOrUserName(){
        Long id = 1L;
        String userName = "liman";
        System.out.println(userService.selectUserByIdOrUserName(id,userName));
    }

    @Test
    public void testSelectByUser(){
        String userName = "admin";
        String userEmail = "admin@mybatis.tk";
        System.out.println(userService.selectByUser(userName,userEmail));
    }

    @Test
    public void testUpdateByIdSelectiveBySet(){
        SysUser sysUser = userService.selectUserById(1001L);
        sysUser.setUserPassword("updatePwd");
        System.out.println(userService.updateByIdSelectiveBySet(sysUser));
    }

    @Test
    public void testSelectByIdList(){
        Long[] ids = {1L,1001L};
        System.out.println(userService.selectByIdList(ids));
    }

    @Test
    public void insertUsers(){
        List<SysUser> users = new ArrayList<SysUser>();
        for(int i = 0;i<2;i++){
            SysUser sysUser = new SysUser();
            sysUser.setUserName("test"+i);
            sysUser.setUserPassword("12345"+i);
            sysUser.setUserEmail("test"+i+"@test.com");
            users.add(sysUser);
        }
        userService.insertUsers(users);
    }

    @Test
    public void testUpdateUsers(){
        Map<String,Object> params = new HashMap<>();
        params.put("id",1L);
        params.put("user_email","admin@testUpdate.com");
        int i = userService.updateUser(params);
        System.out.println(i);
    }
}