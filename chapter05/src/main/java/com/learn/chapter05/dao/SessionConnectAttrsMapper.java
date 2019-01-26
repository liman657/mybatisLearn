package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SessionConnectAttrs;
import java.util.List;

public interface SessionConnectAttrsMapper {
    int insert(SessionConnectAttrs record);

    List<SessionConnectAttrs> selectAll();
}