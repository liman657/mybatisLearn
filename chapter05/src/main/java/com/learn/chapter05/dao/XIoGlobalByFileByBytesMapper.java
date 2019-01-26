package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XIoGlobalByFileByBytes;
import java.util.List;

public interface XIoGlobalByFileByBytesMapper {
    int insert(XIoGlobalByFileByBytes record);

    List<XIoGlobalByFileByBytes> selectAll();
}