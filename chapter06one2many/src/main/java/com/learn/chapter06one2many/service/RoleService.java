package com.learn.chapter06one2many.service;

import com.learn.chapter06one2many.dao.RoleMapper;
import com.learn.chapter06one2many.domain.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Service("roleService")
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    public List<SysRole> selectAllRoleAndPrivileges(){
        return roleMapper.selectAllRoleAndPrivileges();
    }

}
