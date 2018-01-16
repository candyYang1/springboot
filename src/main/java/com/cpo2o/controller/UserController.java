package com.cpo2o.controller;

import com.cpo2o.service.UserService;
import com.cpo2o.springboot.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        User user = userService.getById(48);
        return user.getNickname();
    }
}
