package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XUserSummaryByFileIo;
import java.util.List;

public interface XUserSummaryByFileIoMapper {
    int insert(XUserSummaryByFileIo record);

    List<XUserSummaryByFileIo> selectAll();
}