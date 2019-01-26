package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Proc;
import java.util.List;

public interface ProcMapper {
    int insert(Proc record);

    List<Proc> selectAll();
}