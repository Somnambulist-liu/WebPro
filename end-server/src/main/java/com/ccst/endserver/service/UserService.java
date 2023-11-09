package com.ccst.endserver.service;

import com.ccst.endserver.entity.Result;
import com.ccst.endserver.entity.dao.User;

/**
 * @Author liufuping
 * @Date 2023/11/9 9:37
 * @Version 1.0
 */
public interface UserService {
    Result findUserById(int id);
    Result addUserDetail(User user);
}
