package com.learn.chapter05.dao;

import com.learn.chapter05.domain.HostSummaryByFileIo;
import java.util.List;

public interface HostSummaryByFileIoMapper {
    int insert(HostSummaryByFileIo record);

    List<HostSummaryByFileIo> selectAll();
}