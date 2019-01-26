package com.learn.chapter05.dao;

import com.learn.chapter05.domain.TablePrivileges;
import java.util.List;

public interface TablePrivilegesMapper {
    int insert(TablePrivileges record);

    List<TablePrivileges> selectAll();
}