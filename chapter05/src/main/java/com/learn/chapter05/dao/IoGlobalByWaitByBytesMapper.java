package com.learn.chapter05.dao;

import com.learn.chapter05.domain.IoGlobalByWaitByBytes;
import java.util.List;

public interface IoGlobalByWaitByBytesMapper {
    int insert(IoGlobalByWaitByBytes record);

    List<IoGlobalByWaitByBytes> selectAll();
}