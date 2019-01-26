package com.learn.chapter05.dao;

import com.learn.chapter05.domain.MemoryGlobalByCurrentBytes;
import java.util.List;

public interface MemoryGlobalByCurrentBytesMapper {
    int insert(MemoryGlobalByCurrentBytes record);

    List<MemoryGlobalByCurrentBytes> selectAll();
}