package com.learn.chapter05.dao;

import com.learn.chapter05.domain.TUser;
import java.util.List;

public interface TUserMapper {
    int insert(TUser record);

    List<TUser> selectAll();
}