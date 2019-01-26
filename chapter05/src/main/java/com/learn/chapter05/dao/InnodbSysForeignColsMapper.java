package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbSysForeignCols;
import java.util.List;

public interface InnodbSysForeignColsMapper {
    int insert(InnodbSysForeignCols record);

    List<InnodbSysForeignCols> selectAll();
}