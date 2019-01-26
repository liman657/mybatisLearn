package com.learn.chapter05.dao;

import com.learn.chapter05.domain.UserVariablesByThread;
import java.util.List;

public interface UserVariablesByThreadMapper {
    int insert(UserVariablesByThread record);

    List<UserVariablesByThread> selectAll();
}