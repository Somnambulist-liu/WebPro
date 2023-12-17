package com.ccst.endserver.dao;

import com.ccst.endserver.dto.Page;
import com.ccst.endserver.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 学生表(StudentTb)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-09 09:55:11
 */
@Mapper
public interface StudentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param studentId 主键
     * @return 实例对象
     */
    Student queryById(Integer studentId);

    List<Student> queryAllByLimit(@Param("studentName") String studentName, @Param("pageStart") Integer pageStart, @Param("pageEnd") Integer pageEnd);

    /**
     * 统计总行数
     *
     * @param student 查询条件
     * @return 总行数
     */
    long count(Student student);

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 影响行数
     */
    int insert(Student student);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 影响行数
     */
    int update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param studentId 主键
     * @return 影响行数
     */
    int deleteById(Integer studentId);

    @Select("SELECT student_id,student_name,student_gender,student_class_name,student_major,student_num,student_phone" +
            " FROM student_tb")
    List<Student> queryAll();
}

