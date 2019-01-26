package com.learn.chapter05.dao;

import com.learn.chapter05.domain.MemoryByUserByCurrentBytes;
import java.util.List;

public interface MemoryByUserByCurrentBytesMapper {
    int insert(MemoryByUserByCurrentBytes record);

    List<MemoryByUserByCurrentBytes> selectAll();
}