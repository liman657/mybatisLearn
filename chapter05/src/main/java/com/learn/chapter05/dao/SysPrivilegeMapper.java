package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SysPrivilege;
import java.util.List;

public interface SysPrivilegeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysPrivilege record);

    SysPrivilege selectByPrimaryKey(Long id);

    List<SysPrivilege> selectAll();

    int updateByPrimaryKey(SysPrivilege record);
}