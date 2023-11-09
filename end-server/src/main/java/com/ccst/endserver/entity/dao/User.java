package com.ccst.endserver.entity.dao;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

/**
 * @Author liufuping
 * @Date 2023/11/9 9:04
 * @Version 1.0
 */
@Data
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
