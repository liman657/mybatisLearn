package com.learn.chapter05.dao;

import com.learn.chapter05.domain.GlobalVariables;
import java.util.List;

public interface GlobalVariablesMapper {
    int insert(GlobalVariables record);

    List<GlobalVariables> selectAll();
}