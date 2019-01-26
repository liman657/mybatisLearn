package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbCmpPerIndexReset;
import java.util.List;

public interface InnodbCmpPerIndexResetMapper {
    int insert(InnodbCmpPerIndexReset record);

    List<InnodbCmpPerIndexReset> selectAll();
}