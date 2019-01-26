package com.learn.chapter05.dao;

import com.learn.chapter05.domain.MemoryByHostByCurrentBytes;
import java.util.List;

public interface MemoryByHostByCurrentBytesMapper {
    int insert(MemoryByHostByCurrentBytes record);

    List<MemoryByHostByCurrentBytes> selectAll();
}