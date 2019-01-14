package com.learn.chapter03.dao;

import com.learn.chapter03.domain.SysRole;
import org.apache.ibatis.annotations.*;

/**
 * autor:liman
 * comment:RoleMapper
 */

@Mapper
public interface RoleMapper {
    @Results(id = "roleResultMap", value = {
            @Result(property = "id", column = "id", id = true),
            @Result(property = "roleName", column = "role_name"),
            @Result(property = "enabled", column = "enabled"),
            @Result(property = "createBy", column = "create_by"),
            @Result(property = "createTime", column = "create_time")
    })

//    @Results(id = "BaseResultMap",value = {
//            @Result(property = "id",column = "id",id = true),
//            @Result(property = "roleName",column = "role_name"),
//            @Result(property = "enabled",column = "enabled"),
//            @Result(property = "createBy",column = "create_by"),
//            @Result(property = "createTime",column = "create_time")
//    })


    @Select({"select id,role_name roleName,enabled,create_by createBy,create_time createTime ", "from sys_role ", "where id = #{id}"})
    public SysRole selectById(Long id);

    @ResultMap("roleResultMap")
    @Select({"select id,role_name,enabled,create_by,create_time", "from sys_role ", "where id = #{id}"})
    public SysRole selectById2(Long id);

    /**
     * 不需要返回主键
     *
     * @param sysRole
     * @return
     */
    @Insert({"insert into sys_role(id,role_name,enabled,create_by,create_time)", "values(#{id},#{roleName},#{enabled},#{createBy},#{createTime,jdbcType=TIMESTAMP})"})
    public int insertSysRoleWithOutId(SysRole sysRole);

    /**
     * 自动返回主键，这里不用设置主键，会自动生成主键
     *
     * @param sysRole
     * @return
     */
    @Insert({"insert into sys_role(role_name,enabled,create_by,create_time)", "values(#{roleName},#{enabled},#{createBy},", "#{createTime,jdbcType=TIMESTAMP})"})
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public int insertSysRoleWithAutoIncreament(SysRole sysRole);

    /**
     * 自动返回主键，但是非自增
     *
     * @param sysRole
     * @return
     */
    @Insert({"insert into sys_role(role_name,enabled,create_by,create_time)", "values(#{roleName},#{enabled},#{createBy},", "#{createTime,jdbcType=TIMESTAMP})"})
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", resultType = Long.class, before = false)
    public int insertSysRoleWithIdNotAutoIncreament(SysRole sysRole);

    @Update({"update sys_role set ", "role_name = #{roleName},enabled=#{enabled},create_by = #{createBy},create_time = #{createTime,jdbcType=TIMESTAMP}", " where id = #{id}"})
    public int updateById(SysRole sysRole);

    @Delete("delete from sys_role where id = #{id}")
    public int deleteById(Long id);
}
