package com.learn.chapter03.dao;

import com.learn.chapter03.domain.SysRole;
import com.learn.chapter03.domain.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Repository
public interface UserMapper {

    SysUser getUserById(Integer id);

    List<SysUser> selectAll();

    List<SysRole> selectRolesByUserId(Integer userId);

    int insertUser(SysUser sysUser);

    int insertUserTwo(SysUser sysUser);

    int insertUserThird(SysUser sysUser);

    int updateUserById(SysUser sysUser);

    int deleteUserById(SysUser sysUser);

    List<SysRole> selectRolesByUserIdAndRoleEnabled(@Param("userId") Long userId, @Param("enabled") Integer enabled);
}