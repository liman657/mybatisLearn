package com.learn.chapter06.UserServiceTest;

import com.learn.chapter06.domain.SysUser;
import com.learn.chapter06.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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
    public void testSelectUserAndRoleByUserId(){
        List<SysUser> sysUsers = userService.selectUserAndRoleByUserId(1L);
        for(SysUser sysUser:sysUsers){
            System.out.println(sysUser.getSysRole().getRoleName());
        }
    }

    @Test
    public void testSelectUserAndRoleById2(){
        List<SysUser> sysUsers = userService.selectUserAndRoleById2(1L);
        System.out.println(sysUsers.size());
        for(SysUser sysUser:sysUsers){
            System.out.println(sysUser.getSysRole().getRoleName());
        }
    }

    @Test
    public void testSelectUserAndRoleByIdSelect(){
        List<SysUser> sysUsers = userService.selectUserAndRoleByIdSelect(1L);
        System.out.println(sysUsers.size());
        for(SysUser sysUser:sysUsers){
            System.out.println(sysUser.getSysRole().getRoleName());
        }
    }
}