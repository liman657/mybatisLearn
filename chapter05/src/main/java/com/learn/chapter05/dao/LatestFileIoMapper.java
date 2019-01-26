package com.learn.chapter05.dao;

import com.learn.chapter05.domain.LatestFileIo;
import java.util.List;

public interface LatestFileIoMapper {
    int insert(LatestFileIo record);

    List<LatestFileIo> selectAll();
}