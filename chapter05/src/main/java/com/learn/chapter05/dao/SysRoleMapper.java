package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SysRole;
import java.util.List;

public interface SysRoleMapper {
    int insert(SysRole record);

    List<SysRole> selectAll();
}