package com.example.docker_example.service;

import com.example.docker_example.entity.User;
import com.example.docker_example.mappers.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {


    @Resource
    UserMapper userMapper;

    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }
}
