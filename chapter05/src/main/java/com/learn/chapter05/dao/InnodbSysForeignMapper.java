package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbSysForeign;
import java.util.List;

public interface InnodbSysForeignMapper {
    int insert(InnodbSysForeign record);

    List<InnodbSysForeign> selectAll();
}