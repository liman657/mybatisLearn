package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbSysIndexes;
import java.util.List;

public interface InnodbSysIndexesMapper {
    int insert(InnodbSysIndexes record);

    List<InnodbSysIndexes> selectAll();
}