package com.ccst.endserver.service;

import com.ccst.endserver.dto.Page;
import com.ccst.endserver.entity.Student;
import com.ccst.endserver.vo.PageVo;

import java.util.List;

/**
 * 学生表(StudentTb)表服务接口
 *
 * @author makejava
 * @since 2023-12-09 09:55:11
 */
public interface StudentService {

    List<Student> queryAll();
    PageVo<Student> queryByPage(Page page);

    /**
     * 通过ID查询单条数据
     *
     * @param studentId 主键
     * @return 实例对象
     */
    Student queryById(Integer studentId);

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student insert(Student student);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param studentId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer studentId);

}
