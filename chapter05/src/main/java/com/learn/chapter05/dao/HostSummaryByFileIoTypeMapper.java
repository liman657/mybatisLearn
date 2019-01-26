package com.learn.chapter05.dao;

import com.learn.chapter05.domain.HostSummaryByFileIoType;
import java.util.List;

public interface HostSummaryByFileIoTypeMapper {
    int insert(HostSummaryByFileIoType record);

    List<HostSummaryByFileIoType> selectAll();
}