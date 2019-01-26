package com.learn.chapter05.dao;

import com.learn.chapter05.domain.ProcsPriv;
import java.util.List;

public interface ProcsPrivMapper {
    int insert(ProcsPriv record);

    List<ProcsPriv> selectAll();
}