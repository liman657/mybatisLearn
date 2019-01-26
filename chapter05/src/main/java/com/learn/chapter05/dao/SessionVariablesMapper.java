package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SessionVariables;
import java.util.List;

public interface SessionVariablesMapper {
    int insert(SessionVariables record);

    List<SessionVariables> selectAll();
}