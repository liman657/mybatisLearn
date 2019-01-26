package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SessionSslStatus;
import java.util.List;

public interface SessionSslStatusMapper {
    int insert(SessionSslStatus record);

    List<SessionSslStatus> selectAll();
}