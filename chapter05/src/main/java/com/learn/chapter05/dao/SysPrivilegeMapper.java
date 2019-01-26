package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SysPrivilege;
import java.util.List;

public interface SysPrivilegeMapper {
    int insert(SysPrivilege record);

    List<SysPrivilege> selectAll();
}