package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SysRolePrivilege;

import java.util.List;

public interface SysRolePrivilegeMapper {
    int insert(SysRolePrivilege record);

    List<SysRolePrivilege> selectAll();
}