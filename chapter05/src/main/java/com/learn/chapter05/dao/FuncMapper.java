package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Func;
import java.util.List;

public interface FuncMapper {
    int insert(Func record);

    List<Func> selectAll();
}