package com.demo.service.serviceImpl;

import com.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)

public class UserServiceImplTest {

    @Resource
    private UserService userService;
    @Test
    public void getUserDOById() {
        System.out.println(userService.getUserDOById(1).getUsername());
    }
}