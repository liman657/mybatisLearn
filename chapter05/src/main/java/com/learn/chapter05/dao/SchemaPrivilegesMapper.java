package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SchemaPrivileges;
import java.util.List;

public interface SchemaPrivilegesMapper {
    int insert(SchemaPrivileges record);

    List<SchemaPrivileges> selectAll();
}