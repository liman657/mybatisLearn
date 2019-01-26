package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XUserSummaryByFileIoType;
import java.util.List;

public interface XUserSummaryByFileIoTypeMapper {
    int insert(XUserSummaryByFileIoType record);

    List<XUserSummaryByFileIoType> selectAll();
}