package com.ccst.endserver.controller;

import com.ccst.endserver.dto.Page;
import com.ccst.endserver.entity.Student;
import com.ccst.endserver.service.StudentService;
import com.ccst.endserver.vo.PageVo;
import com.ccst.endserver.vo.ResultVo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学生表(StudentTb)表控制层
 *
 * @author makejava
 * @since 2023-12-09 09:55:11
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;

    @PostMapping("/pages")
    public PageVo<Student> queryBatch(@RequestBody Page page) {
        return this.studentService.queryByPage(page);
    }

    @DeleteMapping("/{id}")
    public ResultVo deleteById(@PathVariable("id") Integer id) {
        this.studentService.deleteById(id);
        return ResultVo.ok("删除成功");
    }
    /**
     * 分页查询
     *
//     * @param  筛选条件
//     * @param  分页对象
     * @return 查询结果
     */
    @GetMapping("/list")
    public ResultVo<PageVo<Student>> queryByPage(@RequestBody Student student) {
        return ResultVo.ok();
    }

    @PutMapping
    public ResultVo addStudent(@RequestBody Student student){
        this.studentService.insert(student);
        return ResultVo.ok();
    }

}

