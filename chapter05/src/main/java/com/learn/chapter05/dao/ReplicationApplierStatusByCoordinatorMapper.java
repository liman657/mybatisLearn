package com.learn.chapter05.dao;

import com.learn.chapter05.domain.ReplicationApplierStatusByCoordinator;
import java.util.List;

public interface ReplicationApplierStatusByCoordinatorMapper {
    int insert(ReplicationApplierStatusByCoordinator record);

    List<ReplicationApplierStatusByCoordinator> selectAll();
}