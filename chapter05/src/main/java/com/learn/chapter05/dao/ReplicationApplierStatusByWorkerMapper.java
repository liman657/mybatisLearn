package com.learn.chapter05.dao;

import com.learn.chapter05.domain.ReplicationApplierStatusByWorker;
import java.util.List;

public interface ReplicationApplierStatusByWorkerMapper {
    int insert(ReplicationApplierStatusByWorker record);

    List<ReplicationApplierStatusByWorker> selectAll();
}