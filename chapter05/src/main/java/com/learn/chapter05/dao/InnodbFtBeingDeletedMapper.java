package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbFtBeingDeleted;
import java.util.List;

public interface InnodbFtBeingDeletedMapper {
    int insert(InnodbFtBeingDeleted record);

    List<InnodbFtBeingDeleted> selectAll();
}