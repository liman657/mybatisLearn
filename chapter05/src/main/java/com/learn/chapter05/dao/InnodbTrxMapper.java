package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbTrx;
import java.util.List;

public interface InnodbTrxMapper {
    int insert(InnodbTrx record);

    List<InnodbTrx> selectAll();
}