package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XLatestFileIo;
import java.util.List;

public interface XLatestFileIoMapper {
    int insert(XLatestFileIo record);

    List<XLatestFileIo> selectAll();
}