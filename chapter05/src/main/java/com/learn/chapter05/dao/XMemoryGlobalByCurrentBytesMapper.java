package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XMemoryGlobalByCurrentBytes;
import java.util.List;

public interface XMemoryGlobalByCurrentBytesMapper {
    int insert(XMemoryGlobalByCurrentBytes record);

    List<XMemoryGlobalByCurrentBytes> selectAll();
}