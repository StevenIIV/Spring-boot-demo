package com.demo;

import com.demo.dao.UserDAO;
import com.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EerSystemApplicationTests {

    @Resource
    UserService userService;
    @Resource
    UserDAO userDAO;
    @Test
    public void contextLoads() {
    }

    @Test
    public void showData(){
        System.out.println(userService.getUserDOById(1).getUsername());
    }

    @Test
    public void showAll(){
        System.out.println(userDAO.selectByPrimaryKey(1));
    }

}
