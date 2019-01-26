package com.learn.chapter05.dao;

import com.learn.chapter05.domain.HostSummaryByStages;
import java.util.List;

public interface HostSummaryByStagesMapper {
    int insert(HostSummaryByStages record);

    List<HostSummaryByStages> selectAll();
}