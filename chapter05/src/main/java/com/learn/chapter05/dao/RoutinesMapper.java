package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Routines;
import java.util.List;

public interface RoutinesMapper {
    int insert(Routines record);

    List<Routines> selectAll();
}