package com.ccst.endserver.service.impl;

import com.ccst.endserver.entity.User;
import com.ccst.endserver.dao.UserDao;
import com.ccst.endserver.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户表(UserTb)表服务实现类
 *
 * @author makejava
 * @since 2023-12-09 09:55:12
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User queryByUserNameAndPassword(User user) {
       return userDao.queryByUserNameAndPassword(user);
    }

    @Override
    public boolean addUserToDb(User user) {
        int insert = userDao.insert(user);
        return insert > 0;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer userId) {
        return this.userDao.queryById(userId);
    }

    /**
     * 分页查询
     *
     * @param user 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
//    @Override
//    public Page<User> queryByPage(User user, PageRequest pageRequest) {
//        long total = this.userTbDao.count(user);
//        return new PageImpl<>(this.userTbDao.queryAllByLimit(user, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getUserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userId) {
        return this.userDao.deleteById(userId) > 0;
    }
}
