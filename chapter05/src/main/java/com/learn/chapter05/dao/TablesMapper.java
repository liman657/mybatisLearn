package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Tables;
import java.util.List;

public interface TablesMapper {
    int insert(Tables record);

    List<Tables> selectAll();
}