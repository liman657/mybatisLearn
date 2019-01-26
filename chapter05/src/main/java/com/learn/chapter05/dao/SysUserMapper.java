package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SysUser;
import java.util.List;

public interface SysUserMapper {
    int insert(SysUser record);

    List<SysUser> selectAll();
}