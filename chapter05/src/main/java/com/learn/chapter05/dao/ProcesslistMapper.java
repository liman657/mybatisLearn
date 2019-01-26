package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Processlist;
import java.util.List;

public interface ProcesslistMapper {
    int insert(Processlist record);

    List<Processlist> selectAll();
}