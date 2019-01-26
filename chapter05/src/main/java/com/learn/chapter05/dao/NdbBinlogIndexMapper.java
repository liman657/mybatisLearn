package com.learn.chapter05.dao;

import com.learn.chapter05.domain.NdbBinlogIndex;
import java.util.List;

public interface NdbBinlogIndexMapper {
    int insert(NdbBinlogIndex record);

    List<NdbBinlogIndex> selectAll();
}