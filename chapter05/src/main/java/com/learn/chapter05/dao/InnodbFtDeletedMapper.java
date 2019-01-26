package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbFtDeleted;
import java.util.List;

public interface InnodbFtDeletedMapper {
    int insert(InnodbFtDeleted record);

    List<InnodbFtDeleted> selectAll();
}