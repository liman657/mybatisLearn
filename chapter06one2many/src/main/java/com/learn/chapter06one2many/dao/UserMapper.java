package com.learn.chapter06one2many.dao;

import com.learn.chapter06one2many.domain.SysRole;
import com.learn.chapter06one2many.domain.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Repository
public interface UserMapper {
    public List<SysUser> selectAllUserAndRoles();

    public List<SysUser> selectAllUserAndRolesAndPrivileges();

    public List<SysUser> selectAllUserAndRolesSelect(Long id);
}