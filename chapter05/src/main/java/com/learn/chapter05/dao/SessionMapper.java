package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Session;
import java.util.List;

public interface SessionMapper {
    int insert(Session record);

    List<Session> selectAll();
}