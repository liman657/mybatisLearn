package com.learn.chapter03.RoleServiceTest;

import com.learn.chapter03.domain.SysRole;
import com.learn.chapter03.service.PrivilegeService;
import com.learn.chapter03.service.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * autor:liman
 * comment:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPrivilegeService {

    @Autowired
    private PrivilegeService privilegeService;

    @Test
    public void testSelectPrivilegeById(){
        Long id = 1L;
        System.out.println(privilegeService.selectSysPrivilegeById(id));
    }

}
