package com.ccst.endserver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 学生表(StudentTb)实体类
 *
 * @author makejava
 * @since 2023-12-09 10:37:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    private static final long serialVersionUID = 612030706660609775L;
    /**
     * 学生id
     */
    private Integer studentId;
    /**
     * 学生名称
     */
    private String studentName;
    /**
     * 学生性别
     */
    private String studentGender;
    /**
     * 学生班级
     */
    private String studentClassName;
    /**
     * 学生专业
     */
    private String studentMajor;
    /**
     * 学号
     */
    private String studentNum;
    /**
     * 学生电话
     */
    private String studentPhone;

}

