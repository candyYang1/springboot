package com.cpo2o.dao;

import com.cpo2o.springboot.User;

public interface UserMapper {
    User selectById(int id);
}
