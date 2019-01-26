package com.learn.chapter05.dao;

import com.learn.chapter05.domain.StatusByThread;
import java.util.List;

public interface StatusByThreadMapper {
    int insert(StatusByThread record);

    List<StatusByThread> selectAll();
}