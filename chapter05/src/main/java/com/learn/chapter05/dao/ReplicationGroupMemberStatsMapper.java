package com.learn.chapter05.dao;

import com.learn.chapter05.domain.ReplicationGroupMemberStats;
import java.util.List;

public interface ReplicationGroupMemberStatsMapper {
    int insert(ReplicationGroupMemberStats record);

    List<ReplicationGroupMemberStats> selectAll();
}