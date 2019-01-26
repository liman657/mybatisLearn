package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SocketSummaryByEventName;
import java.util.List;

public interface SocketSummaryByEventNameMapper {
    int insert(SocketSummaryByEventName record);

    List<SocketSummaryByEventName> selectAll();
}