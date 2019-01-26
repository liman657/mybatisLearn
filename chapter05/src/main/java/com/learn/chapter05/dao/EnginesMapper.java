package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Engines;
import java.util.List;

public interface EnginesMapper {
    int insert(Engines record);

    List<Engines> selectAll();
}