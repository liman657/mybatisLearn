package com.learn.chapter06.dao;

import com.learn.chapter06.domain.SysPrivilege;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

/**
 * autor:liman
 * comment:PrivilegeMapper
 */
@Mapper
public interface PrivilegeMapper {

    @SelectProvider(type = PrivilegeProvider.class, method = "selectById")
    public SysPrivilege selectById(Long id);

}
