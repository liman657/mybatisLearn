package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XMemoryByUserByCurrentBytes;
import java.util.List;

public interface XMemoryByUserByCurrentBytesMapper {
    int insert(XMemoryByUserByCurrentBytes record);

    List<XMemoryByUserByCurrentBytes> selectAll();
}