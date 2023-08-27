package com.example.docker_example.controller;


import com.example.docker_example.entity.User;
import com.example.docker_example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/seelctUserList")
    @ResponseBody
    public List<User> seelctUserList() {
        return userService.selectUserList();
    }
}
