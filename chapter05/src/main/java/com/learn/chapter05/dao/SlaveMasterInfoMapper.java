package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SlaveMasterInfo;
import java.util.List;

public interface SlaveMasterInfoMapper {
    int insert(SlaveMasterInfo record);

    List<SlaveMasterInfo> selectAll();
}