package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XMemoryByThreadByCurrentBytes;
import java.util.List;

public interface XMemoryByThreadByCurrentBytesMapper {
    int insert(XMemoryByThreadByCurrentBytes record);

    List<XMemoryByThreadByCurrentBytes> selectAll();
}