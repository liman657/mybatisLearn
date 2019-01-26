package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SlaveRelayLogInfo;
import java.util.List;

public interface SlaveRelayLogInfoMapper {
    int insert(SlaveRelayLogInfo record);

    List<SlaveRelayLogInfo> selectAll();
}