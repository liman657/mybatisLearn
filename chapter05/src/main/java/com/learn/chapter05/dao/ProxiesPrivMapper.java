package com.learn.chapter05.dao;

import com.learn.chapter05.domain.ProxiesPriv;
import java.util.List;

public interface ProxiesPrivMapper {
    int insert(ProxiesPriv record);

    List<ProxiesPriv> selectAll();
}