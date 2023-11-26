package com.ccst.endserver.controller;

import com.ccst.endserver.entity.Result;
import com.ccst.endserver.entity.dao.User;
import com.ccst.endserver.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author liufuping
 * @Date 2023/11/9 9:33
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    UserService userService;
    @GetMapping()
    public Result getUserById(int id){
        return userService.findUserById(id);
    }
    @PostMapping()
    public Result addUserDetail(User user){
        return userService.addUserDetail(user);
    }
}
