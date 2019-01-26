package com.learn.chapter05.dao;

import com.learn.chapter05.domain.ReplicationApplierConfiguration;
import java.util.List;

public interface ReplicationApplierConfigurationMapper {
    int insert(ReplicationApplierConfiguration record);

    List<ReplicationApplierConfiguration> selectAll();
}