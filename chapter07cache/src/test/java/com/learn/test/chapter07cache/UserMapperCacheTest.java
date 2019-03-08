package com.learn.test.chapter07cache;

import com.learn.chaper07cache.domain.POJO.SysRole;
import com.learn.chaper07cache.mapper.RoleMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * autor:liman
 * comment: 缓存测试
 */
public class UserMapperCacheTest {

    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init(){
        try{
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            SysRole sysRole = roleMapper.selectRoleById(3L);
            System.out.println(sysRole.toString());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void test1LCache(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            SysRole sysRole1 = roleMapper.selectRoleById(3L);
            sysRole1.setRoleName("test");
            SysRole sysRole2 = roleMapper.selectRoleById(3L);
            System.out.println("test".equals(sysRole2.getRoleName())); //true;
            System.out.println(sysRole1 == sysRole2);
            System.out.println(sysRole1.toString());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

        System.out.println("开启新的sqlSession");
        sqlSession = sqlSessionFactory.openSession();
        try{
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            SysRole sysRole3 = roleMapper.selectRoleById(3L);
            System.out.println("test".equals(sysRole3.getRoleName()));
            roleMapper.deleteRoleById(5L);
            SysRole sysRole4 = roleMapper.selectRoleById(3L);
            System.out.println(sysRole3 == sysRole4);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testL2Cache(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SysRole sysRole1 = null;
        try{
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            sysRole1 = roleMapper.selectRoleById(3L);
            sysRole1.setRoleName("test");
            SysRole sysRole2 = roleMapper.selectRoleById(3L);
            System.out.println("test".equals(sysRole2.getRoleName()));
            System.out.println(sysRole1 == sysRole2);
        }catch (Exception e){

        }finally{
            sqlSession.close();
        }

        System.out.println("重新开一个sqlSession");

        sqlSession = sqlSessionFactory.openSession();
        try {
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            SysRole sysRole3 = roleMapper.selectRoleById(3L);
            System.out.println("test".equals(sysRole3.getRoleName()));
            SysRole sysRole4 = roleMapper.selectRoleById(3L);
            System.out.println(sysRole3 == sysRole4);
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
    }
}