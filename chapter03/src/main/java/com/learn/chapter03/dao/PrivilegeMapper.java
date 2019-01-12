package com.learn.chapter03.dao;

import com.learn.chapter03.domain.SysPrivilege;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Mapper
public interface PrivilegeMapper {

    @SelectProvider(type = PrivilegeProvider.class,method = "selectById")
    public SysPrivilege selectById(Long id);

}
