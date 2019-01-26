package com.learn.chapter05.dao;

import com.learn.chapter05.domain.MemoryByThreadByCurrentBytes;
import java.util.List;

public interface MemoryByThreadByCurrentBytesMapper {
    int insert(MemoryByThreadByCurrentBytes record);

    List<MemoryByThreadByCurrentBytes> selectAll();
}