package com.learn.chapter05.dao;

import com.learn.chapter05.domain.GlobalStatus;
import java.util.List;

public interface GlobalStatusMapper {
    int insert(GlobalStatus record);

    List<GlobalStatus> selectAll();
}