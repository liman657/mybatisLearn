package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XUserSummary;
import java.util.List;

public interface XUserSummaryMapper {
    int insert(XUserSummary record);

    List<XUserSummary> selectAll();
}