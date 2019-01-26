package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbTempTableInfo;
import java.util.List;

public interface InnodbTempTableInfoMapper {
    int insert(InnodbTempTableInfo record);

    List<InnodbTempTableInfo> selectAll();
}