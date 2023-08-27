package com.example.docker_example.mappers;

import com.example.docker_example.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> selectUserList();
}
