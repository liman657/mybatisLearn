package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Accounts;
import java.util.List;

public interface AccountsMapper {
    int insert(Accounts record);

    List<Accounts> selectAll();
}