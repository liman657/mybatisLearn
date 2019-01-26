package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbSysFields;
import java.util.List;

public interface InnodbSysFieldsMapper {
    int insert(InnodbSysFields record);

    List<InnodbSysFields> selectAll();
}