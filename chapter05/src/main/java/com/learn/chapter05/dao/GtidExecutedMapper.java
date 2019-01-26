package com.learn.chapter05.dao;

import com.learn.chapter05.domain.GtidExecuted;
import java.util.List;

public interface GtidExecutedMapper {
    int insert(GtidExecuted record);

    List<GtidExecuted> selectAll();
}