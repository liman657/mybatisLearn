package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SessionAccountConnectAttrs;
import java.util.List;

public interface SessionAccountConnectAttrsMapper {
    int insert(SessionAccountConnectAttrs record);

    List<SessionAccountConnectAttrs> selectAll();
}