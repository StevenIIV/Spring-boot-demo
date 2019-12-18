package com.demo.service.serviceImpl;

import com.demo.dao.UserDAO;
import com.demo.model.UserDO;
import com.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDAO userDAO;
    @Override
    public UserDO getUserDOById(Integer id) {
        return userDAO.selectByPrimaryKey(id);
    }
}
