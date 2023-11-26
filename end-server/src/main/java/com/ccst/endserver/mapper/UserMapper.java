package com.ccst.endserver.mapper;

import com.ccst.endserver.entity.dao.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author liufuping
 * @Date 2023/11/9 8:42
 * @Version 1.0
 */
@Mapper
@Repository
public interface UserMapper {
    @Select("SELECT id, userName, passWord, createTime, updateTime FROM user_tb WHERE id=#{id}")
    User findUserById(Integer id);

    @Insert("INSERT INTO user_tb (userName, passWord, createTime, updateTime) VALUES (#{userName},#{passWord},#{createTime},#{updateTime})")
    void insertUser(User user);
}
