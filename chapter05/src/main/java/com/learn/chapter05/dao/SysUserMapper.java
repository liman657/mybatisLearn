package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SysUser;
import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);
}