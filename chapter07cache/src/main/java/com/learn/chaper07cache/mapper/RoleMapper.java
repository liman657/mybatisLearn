package com.learn.chaper07cache.mapper;

import com.learn.chaper07cache.domain.POJO.SysRole;
import org.springframework.stereotype.Repository;

/**
 * autor:liman
 * comment:
 */
@Repository
public interface RoleMapper {

    public SysRole selectRoleById(Long id);

    public int deleteRoleById(Long id);

}