package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbSysDatafiles;
import java.util.List;

public interface InnodbSysDatafilesMapper {
    int insert(InnodbSysDatafiles record);

    List<InnodbSysDatafiles> selectAll();
}