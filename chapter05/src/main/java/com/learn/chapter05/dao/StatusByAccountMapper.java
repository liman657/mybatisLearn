package com.learn.chapter05.dao;

import com.learn.chapter05.domain.StatusByAccount;
import java.util.List;

public interface StatusByAccountMapper {
    int insert(StatusByAccount record);

    List<StatusByAccount> selectAll();
}