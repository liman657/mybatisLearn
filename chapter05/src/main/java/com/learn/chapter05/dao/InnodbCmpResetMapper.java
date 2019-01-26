package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbCmpReset;
import java.util.List;

public interface InnodbCmpResetMapper {
    int insert(InnodbCmpReset record);

    List<InnodbCmpReset> selectAll();
}