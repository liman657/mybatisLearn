package com.learn.mybatislearn.dao;

        import com.learn.mybatislearn.domain.User;
        import org.springframework.stereotype.Repository;

/**
 * autor:liman
 * comment:
 */
@Repository
public interface UserMapper {

    User getUserById(Integer id);

}