package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SysUserRole;
import java.util.List;

public interface SysUserRoleMapper {
    int insert(SysUserRole record);

    List<SysUserRole> selectAll();
}