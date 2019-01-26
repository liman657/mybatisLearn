package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SetupObjects;
import java.util.List;

public interface SetupObjectsMapper {
    int insert(SetupObjects record);

    List<SetupObjects> selectAll();
}