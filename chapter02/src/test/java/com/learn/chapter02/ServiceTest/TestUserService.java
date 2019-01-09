package com.learn.chapter02.ServiceTest;

import com.learn.chapter02.domain.SysRole;
import com.learn.chapter02.service.UserService;
import org.junit.Assert;
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
public class TestUserService {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUserById() {
        Integer id = 1;
        userService.getUserById(1);
    }

    @Test
    public void testSelectAll(){
        userService.selectAll();
    }

    @Test
    public void testSelectRolesByUserId(){
        Integer userId = 1;
        List<SysRole> roleList = userService.selectRolesByUserId(userId);

        System.out.println(roleList.get(0));
    }

}
