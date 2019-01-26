package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SetupActors;
import java.util.List;

public interface SetupActorsMapper {
    int insert(SetupActors record);

    List<SetupActors> selectAll();
}