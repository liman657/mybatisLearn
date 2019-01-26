package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Users;
import java.util.List;

public interface UsersMapper {
    int insert(Users record);

    List<Users> selectAll();
}