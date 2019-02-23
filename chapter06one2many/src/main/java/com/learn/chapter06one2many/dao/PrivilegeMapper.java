package com.learn.chapter06one2many.dao;

import com.learn.chapter06one2many.domain.SysPrivilege;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * autor:liman
 * comment:PrivilegeMapper
 */
//@Mapper
public interface PrivilegeMapper {

//    @SelectProvider(type = PrivilegeProvider.class, method = "selectById")
    public SysPrivilege selectById(Long id);

    public List<SysPrivilege> selectPrivilegeByRoleId(Long roleId);

}
