package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbSysVirtual;
import java.util.List;

public interface InnodbSysVirtualMapper {
    int insert(InnodbSysVirtual record);

    List<InnodbSysVirtual> selectAll();
}