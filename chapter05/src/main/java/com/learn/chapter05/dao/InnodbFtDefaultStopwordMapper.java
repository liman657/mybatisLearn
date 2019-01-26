package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbFtDefaultStopword;
import java.util.List;

public interface InnodbFtDefaultStopwordMapper {
    int insert(InnodbFtDefaultStopword record);

    List<InnodbFtDefaultStopword> selectAll();
}