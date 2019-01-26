package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XHostSummaryByStages;
import java.util.List;

public interface XHostSummaryByStagesMapper {
    int insert(XHostSummaryByStages record);

    List<XHostSummaryByStages> selectAll();
}