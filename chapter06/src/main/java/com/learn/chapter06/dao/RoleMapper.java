package com.learn.chapter06.dao;

import com.learn.chapter06.domain.SysRole;
import com.learn.chapter06.domain.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Repository
public interface RoleMapper {

    public SysRole selectRoleById();

}