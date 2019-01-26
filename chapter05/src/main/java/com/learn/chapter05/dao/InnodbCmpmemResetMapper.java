package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbCmpmemReset;
import java.util.List;

public interface InnodbCmpmemResetMapper {
    int insert(InnodbCmpmemReset record);

    List<InnodbCmpmemReset> selectAll();
}