package com.ccst.endserver.controller;

import com.ccst.endserver.entity.Result;
import com.ccst.endserver.entity.dao.User;
import com.ccst.endserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liufuping
 * @Date 2023/11/9 9:33
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping()
    public Result addUserDetail(User user){
        return userService.addUserDetail(user);
    }
}
