package com.learn.chapter05.dao;

import com.learn.chapter05.domain.UserPrivileges;
import java.util.List;

public interface UserPrivilegesMapper {
    int insert(UserPrivileges record);

    List<UserPrivileges> selectAll();
}