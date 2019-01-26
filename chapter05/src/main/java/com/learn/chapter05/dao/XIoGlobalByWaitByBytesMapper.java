package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XIoGlobalByWaitByBytes;
import java.util.List;

public interface XIoGlobalByWaitByBytesMapper {
    int insert(XIoGlobalByWaitByBytes record);

    List<XIoGlobalByWaitByBytes> selectAll();
}