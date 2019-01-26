package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XWaitsByUserByLatency;
import java.util.List;

public interface XWaitsByUserByLatencyMapper {
    int insert(XWaitsByUserByLatency record);

    List<XWaitsByUserByLatency> selectAll();
}