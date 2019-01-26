package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SysConfig;
import java.util.List;

public interface SysConfigMapper {
    int insert(SysConfig record);

    List<SysConfig> selectAll();
}