package com.cpo2o.service.impl;

import com.cpo2o.dao.UserMapper;
import com.cpo2o.service.UserService;
import com.cpo2o.springboot.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class UserServiceImpl implements UserService, Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    private UserMapper userMapper;
    @Override
    public User getById(int id) {
        // TODO Auto-generated method stub
        User user = userMapper.selectById(id);
        return user;
    }
}
