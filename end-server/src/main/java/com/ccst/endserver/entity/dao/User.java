package com.ccst.endserver.entity.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author liufuping
 * @Date 2023/11/9 9:04
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
