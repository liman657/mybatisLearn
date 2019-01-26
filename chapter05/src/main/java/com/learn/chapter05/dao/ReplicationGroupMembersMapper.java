package com.learn.chapter05.dao;

import com.learn.chapter05.domain.ReplicationGroupMembers;
import java.util.List;

public interface ReplicationGroupMembersMapper {
    int insert(ReplicationGroupMembers record);

    List<ReplicationGroupMembers> selectAll();
}