package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbFtConfig;
import java.util.List;

public interface InnodbFtConfigMapper {
    int insert(InnodbFtConfig record);

    List<InnodbFtConfig> selectAll();
}