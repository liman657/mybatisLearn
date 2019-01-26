package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XMemoryByHostByCurrentBytes;
import java.util.List;

public interface XMemoryByHostByCurrentBytesMapper {
    int insert(XMemoryByHostByCurrentBytes record);

    List<XMemoryByHostByCurrentBytes> selectAll();
}