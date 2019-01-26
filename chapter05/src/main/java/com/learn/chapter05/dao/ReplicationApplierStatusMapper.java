package com.learn.chapter05.dao;

import com.learn.chapter05.domain.ReplicationApplierStatus;
import java.util.List;

public interface ReplicationApplierStatusMapper {
    int insert(ReplicationApplierStatus record);

    List<ReplicationApplierStatus> selectAll();
}