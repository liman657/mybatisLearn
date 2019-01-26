package com.learn.chapter05.dao;

import com.learn.chapter05.domain.VariablesByThread;
import java.util.List;

public interface VariablesByThreadMapper {
    int insert(VariablesByThread record);

    List<VariablesByThread> selectAll();
}