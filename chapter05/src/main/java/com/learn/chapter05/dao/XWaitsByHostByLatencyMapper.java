package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XWaitsByHostByLatency;
import java.util.List;

public interface XWaitsByHostByLatencyMapper {
    int insert(XWaitsByHostByLatency record);

    List<XWaitsByHostByLatency> selectAll();
}