package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbSysTablespaces;
import java.util.List;

public interface InnodbSysTablespacesMapper {
    int insert(InnodbSysTablespaces record);

    List<InnodbSysTablespaces> selectAll();
}