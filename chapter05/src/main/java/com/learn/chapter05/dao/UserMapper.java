package com.learn.chapter05.dao;

import com.learn.chapter05.domain.User;
import java.util.List;

public interface UserMapper {
    int insert(User record);

    List<User> selectAll();
}