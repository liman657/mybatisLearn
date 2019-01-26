package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XUserSummaryByStages;
import java.util.List;

public interface XUserSummaryByStagesMapper {
    int insert(XUserSummaryByStages record);

    List<XUserSummaryByStages> selectAll();
}