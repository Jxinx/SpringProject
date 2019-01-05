package com.jxinx.dao;

import com.jxinx.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * mapper接口
 */

@Mapper
public interface UserDao {
    @Select("SELECT * FROM t_user WHERE id = #{id}")
    User findUserById(@Param("id") Integer id);

    @Insert("INSERT INTO t_user(name, age) VALUES(#{user.name}, #{user.age})")
    int addUser(@Param("user") User user);
}