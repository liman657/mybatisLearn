package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XHostSummaryByFileIo;
import java.util.List;

public interface XHostSummaryByFileIoMapper {
    int insert(XHostSummaryByFileIo record);

    List<XHostSummaryByFileIo> selectAll();
}