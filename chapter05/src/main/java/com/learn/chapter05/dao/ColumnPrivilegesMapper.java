package com.learn.chapter05.dao;

import com.learn.chapter05.domain.ColumnPrivileges;
import java.util.List;

public interface ColumnPrivilegesMapper {
    int insert(ColumnPrivileges record);

    List<ColumnPrivileges> selectAll();
}