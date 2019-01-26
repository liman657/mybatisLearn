package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XHostSummary;
import java.util.List;

public interface XHostSummaryMapper {
    int insert(XHostSummary record);

    List<XHostSummary> selectAll();
}