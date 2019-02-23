package com.learn.chapter06one2one.dao;

import com.learn.chapter06one2one.domain.SysRole;
import org.springframework.stereotype.Repository;

/**
 * autor:liman
 * comment:
 */
@Repository
public interface RoleMapper {

    public SysRole selectRoleById();

}