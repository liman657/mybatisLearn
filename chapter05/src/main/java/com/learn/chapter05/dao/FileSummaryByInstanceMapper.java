package com.learn.chapter05.dao;

import com.learn.chapter05.domain.FileSummaryByInstance;
import java.util.List;

public interface FileSummaryByInstanceMapper {
    int insert(FileSummaryByInstance record);

    List<FileSummaryByInstance> selectAll();
}