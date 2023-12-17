package com.ccst.endserver.controller;

import com.ccst.endserver.entity.User;
import com.ccst.endserver.service.UserService;
import com.ccst.endserver.vo.ResultVo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户表(UserTb)表控制层
 *
 * @author makejava
 * @since 2023-12-09 09:55:11
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过传入的userName和userPassword条件
     * 查询单条用户数据
     */
    @PostMapping("/login")
    public ResultVo login(@RequestBody User user) {
        this.userService.queryByUserNameAndPassword(user);
        return ResultVo.ok();
    }

    @PostMapping("/register")
    public ResultVo register(@RequestBody User user) {
        this.userService.addUserToDb(user);
        return ResultVo.ok("注册成功");
    }


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<User> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.userService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param user 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<User> add(User user) {
        return ResponseEntity.ok(this.userService.insert(user));
    }

    /**
     * 编辑数据
     *
     * @param user 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<User> edit(User user) {
        return ResponseEntity.ok(this.userService.update(user));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.userService.deleteById(id));
    }

}

