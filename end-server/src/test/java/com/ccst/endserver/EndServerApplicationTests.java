package com.ccst.endserver;

import com.ccst.endserver.entity.dao.User;
import com.ccst.endserver.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class EndServerApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
    }

    @Test
    Integer dbInsertTest(){
        return 0;
    }

}
