package com.learn.chapter05.dao;

import com.learn.chapter05.domain.FileSummaryByEventName;
import java.util.List;

public interface FileSummaryByEventNameMapper {
    int insert(FileSummaryByEventName record);

    List<FileSummaryByEventName> selectAll();
}