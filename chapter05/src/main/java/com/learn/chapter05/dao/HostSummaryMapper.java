package com.learn.chapter05.dao;

import com.learn.chapter05.domain.HostSummary;
import java.util.List;

public interface HostSummaryMapper {
    int insert(HostSummary record);

    List<HostSummary> selectAll();
}