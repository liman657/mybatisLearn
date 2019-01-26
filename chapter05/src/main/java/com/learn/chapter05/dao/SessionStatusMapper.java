package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SessionStatus;
import java.util.List;

public interface SessionStatusMapper {
    int insert(SessionStatus record);

    List<SessionStatus> selectAll();
}