package com.learn.chapter03.RoleServiceTest;

import com.learn.chapter03.domain.SysRole;
import com.learn.chapter03.domain.SysUser;
import com.learn.chapter03.service.RoleService;
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
public class TestRoleService {

    @Autowired
    private RoleService roleService;

    @Test
    public void testSelectRoleById() {
        Long id = 1L;
        SysRole sysRole = roleService.selectSysRoleById(id);
        System.out.println(sysRole.getRoleName());
        System.out.println(sysRole);
    }

    @Test
    public void testSelectRoleById2() {
        Long id = 1L;
        SysRole sysRole = roleService.selectSysRoleById2(id);
        System.out.println(sysRole.getRoleName());
        System.out.println(sysRole);
    }

    @Test
    public void insertSysRoleWithIdReturn() {
        SysRole sysRole = new SysRole();
        sysRole.setId(3L);
        sysRole.setRoleName("普通用户test");
        sysRole.setEnabled(1);
        sysRole.setCreateBy("1");
        sysRole.setCreateTime(new Date());
        roleService.insertSysRoleWithIdReturn(sysRole);
    }

    @Test
    public void testInsertSysRoleWithAutoIncrementId() {
        SysRole sysRole = new SysRole();
        sysRole.setRoleName("普通用户test");
        sysRole.setEnabled(1);
        sysRole.setCreateBy("1");
        sysRole.setCreateTime(new Date());
        int key = roleService.insertSysRoleWithAutoIncreament(sysRole);
        System.out.println(key);
    }

    @Test
    public void testInsertSysRoleWithIdNotAutoIncreament() {
        SysRole sysRole = new SysRole();
        sysRole.setRoleName("普通用户test");
        sysRole.setEnabled(1);
        sysRole.setCreateBy("1");
        sysRole.setCreateTime(new Date());
        int key = roleService.insertSysRoleWithIdNotAutoIncreament(sysRole);
        System.out.println(key);
    }

    @Test
    public void testUpdateRoleById() {
        SysRole sysRole = roleService.selectSysRoleById2(7L);
        System.out.println(sysRole.getCreateBy() + ":" + sysRole.getCreateTime());
        sysRole.setRoleName("updateTest");
        roleService.updateSysRole(sysRole);
    }

    @Test
    public void testDeleteSysRoleById() {
        Long id = 7L;
        roleService.deleteSysRoleById(id);
    }
}
