package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SocketSummaryByInstance;
import java.util.List;

public interface SocketSummaryByInstanceMapper {
    int insert(SocketSummaryByInstance record);

    List<SocketSummaryByInstance> selectAll();
}