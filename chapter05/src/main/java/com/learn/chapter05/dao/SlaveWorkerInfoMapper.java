package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SlaveWorkerInfo;
import java.util.List;

public interface SlaveWorkerInfoMapper {
    int insert(SlaveWorkerInfo record);

    List<SlaveWorkerInfo> selectAll();
}