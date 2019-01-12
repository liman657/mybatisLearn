package com.learn.chapter03.service;

import com.learn.chapter03.dao.RoleMapper;
import com.learn.chapter03.domain.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public SysRole selectSysRoleById(Long id){
        return roleMapper.selectById(id);
    }

    public SysRole selectSysRoleById2(Long id) {
        return roleMapper.selectById2(id);
    }

    public int insertSysRoleWithIdReturn(SysRole sysRole){
        return roleMapper.insertSysRoleWithOutId(sysRole);
    }

    public int insertSysRoleWithAutoIncreament(SysRole sysRole){
        return roleMapper.insertSysRoleWithAutoIncreament(sysRole);
    }

    public int insertSysRoleWithIdNotAutoIncreament(SysRole sysRole){
        return roleMapper.insertSysRoleWithIdNotAutoIncreament(sysRole);
    }

    public int updateSysRole(SysRole sysRole){
        return roleMapper.updateById(sysRole);
    }

    public int deleteSysRoleById(Long id){
        return roleMapper.deleteById(id);
    }
}
