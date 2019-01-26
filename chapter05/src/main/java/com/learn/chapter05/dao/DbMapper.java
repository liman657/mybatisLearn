package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Db;
import java.util.List;

public interface DbMapper {
    int insert(Db record);

    List<Db> selectAll();
}