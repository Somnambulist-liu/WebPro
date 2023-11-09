package com.ccst.endserver.service.impl;

import com.ccst.endserver.entity.Result;
import com.ccst.endserver.entity.dao.User;
import com.ccst.endserver.mapper.UserMapper;
import com.ccst.endserver.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @Author liufuping
 * @Date 2023/11/9 9:40
 * @Version 1.0
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public Result addUserDetail(User user) {
        log.info(user.toString());
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateTime(LocalDateTime.now());
        userMapper.insertUser(user);
        return Result.ok();
    }
}
