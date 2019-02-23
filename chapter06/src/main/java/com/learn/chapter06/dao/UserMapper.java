package com.learn.chapter06.dao;

import com.learn.chapter06.domain.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Repository
public interface UserMapper {

    public List<SysUser> selectUserAndRoleByUserId(Long id);

    public List<SysUser> selectUserAndRoleById2(Long id);

    public List<SysUser> selectUserAndRoleByIdSelect(Long id);

    List<SysUser> selectUserAndRoleByUserId_userRoleMap(Long id);
}