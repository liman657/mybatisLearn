package com.learn.chapter03.RoleServiceTest;

import com.learn.chapter03.domain.SysRole;
import com.learn.chapter03.domain.SysUser;
import com.learn.chapter03.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
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
        userService.getUserById(id);
    }

    @Test
    public void testSelectAll() {
        userService.selectAll();
    }

    @Test
    public void testSelectRolesByUserId() {
        Integer userId = 1;
        List<SysRole> roleList = userService.selectRolesByUserId(userId);
        System.out.println("roleList的size:" + roleList.size());
        for (int i = 0; i < roleList.size(); i++) {
            System.out.println(roleList.get(i));
        }
    }

    @Test
    public void testInsertUser() {
        SysUser user = new SysUser();
        user.setId(6L);
        user.setUserEmail("liman@qq.com");
        user.setUserInfo("liman just test");
        user.setUserName("liman");
        user.setUserPassword("123456");
        user.setCreateTime(new Date());
        user.setHeadImg(new byte[]{1, 2, 3});
        userService.insertUser(user);
    }

    @Test
    public void testInsertUserTwo() {
        SysUser user = new SysUser();
        user.setCreateTime(new Date());
        user.setHeadImg(new byte[]{2, 3, 5});
        user.setUserEmail("test@test.com");
        user.setUserInfo("testInfo");
        user.setUserName("testJdbcId");
        user.setUserPassword("testJdbcPwd");
        userService.insertUserTow(user);
    }

    @Test
    public void testInsertUserThird() {
        SysUser user = new SysUser();
        user.setCreateTime(new Date());
        user.setHeadImg(new byte[]{2, 3, 5});
        user.setUserEmail("test@test.com");
        user.setUserInfo("testInfo");
        user.setUserName("testJdbcId");
        user.setUserPassword("testJdbcPwd");
        userService.insertUserThird(user);
    }

    @Test
    public void testUpdateSysUserById() {
        userService.updateUserById(1001);
    }

    @Test
    public void testDeleteUserById() {
        userService.deleteUserById(1005);
    }

    @Test
    public void testSelectRolesByUserIdAndRoleEnabled() {
        List<SysRole> sysRoles = userService.selectRolesByUserIdAndRoleEnabled(1L, 1);
        for (SysRole sysRole : sysRoles) {
            System.out.println(sysRole.toString());
        }
    }

}
