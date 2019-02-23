package com.learn.chapter06one2many.UserServiceTest;

import com.learn.chapter06one2many.domain.SysPrivilege;
import com.learn.chapter06one2many.domain.SysRole;
import com.learn.chapter06one2many.service.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleServiceTest {

    @Autowired
    private RoleService roleService;

    @Test
    public void testSelectAllRoleAndPrivileges(){
        List<SysRole> roleList = roleService.selectAllRoleAndPrivileges();
        for(SysRole role:roleList){
            System.out.println(role.getRoleName()+":"+"所具有的权限");
            for(SysPrivilege privilege:role.getPrivilegeList()){
                System.out.println(privilege.getPrivilegeName()+":"+privilege.getPrivilegeUrl());
            }
            System.out.println("======================");
        }
    }

}
