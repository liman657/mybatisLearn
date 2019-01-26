package com.learn.chapter05.dao;

import com.learn.chapter05.domain.StatusByUser;
import java.util.List;

public interface StatusByUserMapper {
    int insert(StatusByUser record);

    List<StatusByUser> selectAll();
}