package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Threads;
import java.util.List;

public interface ThreadsMapper {
    int insert(Threads record);

    List<Threads> selectAll();
}