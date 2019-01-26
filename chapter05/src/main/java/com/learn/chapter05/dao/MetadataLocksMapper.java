package com.learn.chapter05.dao;

import com.learn.chapter05.domain.MetadataLocks;
import java.util.List;

public interface MetadataLocksMapper {
    int insert(MetadataLocks record);

    List<MetadataLocks> selectAll();
}