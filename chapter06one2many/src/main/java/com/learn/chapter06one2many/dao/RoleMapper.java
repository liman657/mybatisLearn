package com.learn.chapter06one2many.dao;

import com.learn.chapter06one2many.domain.SysRole;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Repository
public interface RoleMapper {

    public SysRole selectRoleById();

    public List<SysRole> selectAllRoleAndPrivileges();

    public List<SysRole> selectRoleByUserId(Long userId);
}