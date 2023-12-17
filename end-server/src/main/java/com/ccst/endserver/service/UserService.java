package com.ccst.endserver.service;

import com.ccst.endserver.entity.User;

/**
 * 用户表(UserTb)表服务接口
 *
 * @author makejava
 * @since 2023-12-09 09:55:11
 */
public interface UserService {

   User queryByUserNameAndPassword(User user);

   boolean addUserToDb(User user);

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    User queryById(Integer userId);

    /**
     * 分页查询
     *
     * @param userTb 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
//    Page<UserTb> queryByPage(UserTb userTb, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User update(User user);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userId);

}
