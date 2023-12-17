package com.ccst.endserver.service.impl;

import com.ccst.endserver.dto.Page;
import com.ccst.endserver.entity.Student;
import com.ccst.endserver.dao.StudentDao;
import com.ccst.endserver.service.StudentService;
import com.ccst.endserver.vo.PageVo;
import com.sun.org.apache.bcel.internal.generic.NEW;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学生表(StudentTb)表服务实现类
 *
 * @author makejava
 * @since 2023-12-09 09:55:11
 */
@Slf4j
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;
    public List<Student> queryAll(){
        return this.studentDao.queryAll();
    }

    @Override
    public PageVo<Student> queryByPage(Page page) {
        Integer pageIndex = page.getPageIndex();
        Integer pageSize = page.getPageSize();
        String studentName = page.getSearchWord();
        page.setPageIndex(pageIndex - 1);
        if (studentName != null) {
            Student student = new Student();
            student.setStudentName(studentName);
            Long pageCountTotal = this.studentDao.count(student);
            Integer pageTotal = (int) Math.ceil((double) pageCountTotal / pageSize);
            Integer pageStart = page.getPageIndex() * page.getPageSize();
            Integer pageEnd = page.getPageIndex() * page.getPageSize() + page.getPageSize();
            List<Student> studentList = this.studentDao.queryAllByLimit(studentName, pageStart, pageEnd);
            return new PageVo<>("查询成功", studentList, pageTotal, pageIndex);
        } else {
                Long pageCountTotal = this.studentDao.count(null);
                Integer pageTotal = (int) Math.ceil((double) pageCountTotal / pageSize);
                Integer pageStart = page.getPageIndex() * page.getPageSize();
                Integer pageEnd = page.getPageIndex() * page.getPageSize() + page.getPageSize();
                List<Student> studentList = this.studentDao.queryAllByLimit(null, pageStart, pageEnd);
                return new PageVo<>("查询成功", studentList, pageTotal, pageIndex);
        }
    }

    /**
     * 通过ID查询单条数据
     *
     * @param studentId 主键
     * @return 实例对象
     */
    @Override
    public Student queryById(Integer studentId) {
        return this.studentDao.queryById(studentId);
    }

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student insert(Student student) {
        this.studentDao.insert(student);
        return student;
    }

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student update(Student student) {
        this.studentDao.update(student);
        return this.queryById(student.getStudentId());
    }

    /**
     * 通过主键删除数据
     *
     * @param studentId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer studentId) {
        return this.studentDao.deleteById(studentId) > 0;
    }
}
