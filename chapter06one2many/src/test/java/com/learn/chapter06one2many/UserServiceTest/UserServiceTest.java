package com.learn.chapter06one2many.UserServiceTest;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */

import com.learn.chapter06one2many.domain.SysPrivilege;
import com.learn.chapter06one2many.domain.SysRole;
import com.learn.chapter06one2many.domain.SysUser;
import com.learn.chapter06one2many.service.UserService;
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
    public void testSelectAllUserAndRoles(){
        List<SysUser> userList= userService.selectAllUserAndRoles();
        for(SysUser user:userList){
            System.out.println(user.getId()+":"+user.getUserName()+": 所含有的角色：");

//            System.out.println(user.getRoleList().getRoleName());
            for(SysRole role:user.getRoleList()){
                System.out.println(role.getRoleName());
            }
            System.out.println("=================");
        }
    }

    @Test
    public void testSelectAllUserAndRolesAndPrivileges(){
        List<SysUser> userList = userService.selectAllUserAndRolesAndPrivileges();
        for(SysUser user:userList){
            System.out.println(user.getId()+":"+user.getUserName()+": 所含有的角色：");

//            System.out.println(user.getRoleList().getRoleName());
            for(SysRole role:user.getRoleList()){
                System.out.println(role.getRoleName()+":"+"所含有的权限");
                for(SysPrivilege privilege:role.getPrivilegeList()){
                    System.out.println(privilege.getPrivilegeName()+":"+privilege.getPrivilegeUrl());
                }
                System.out.println("++++++++++++");
            }
            System.out.println("=================");
        }
    }

    @Test
    public void testSelectAllUserAndRolesSelect(){
        List<SysUser> userList = userService.selectAllUserAndRolesSelect(1L);
        for(SysUser user:userList){
            System.out.println(user.getId()+":"+user.getUserName()+": 所含有的角色：");

//            System.out.println(user.getRoleList().getRoleName());
            for(SysRole role:user.getRoleList()){
                System.out.println(role.getRoleName()+":"+"所含有的权限");
                for(SysPrivilege privilege:role.getPrivilegeList()){
                    System.out.println(privilege.getPrivilegeName()+":"+privilege.getPrivilegeUrl());
                }
                System.out.println("++++++++++++");
            }
            System.out.println("=================");
        }
    }
}
