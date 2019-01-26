package com.learn.chapter05.dao;

import com.learn.chapter05.domain.IoGlobalByFileByBytes;
import java.util.List;

public interface IoGlobalByFileByBytesMapper {
    int insert(IoGlobalByFileByBytes record);

    List<IoGlobalByFileByBytes> selectAll();
}