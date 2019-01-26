package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XHostSummaryByFileIoType;
import java.util.List;

public interface XHostSummaryByFileIoTypeMapper {
    int insert(XHostSummaryByFileIoType record);

    List<XHostSummaryByFileIoType> selectAll();
}