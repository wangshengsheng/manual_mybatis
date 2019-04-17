package com.example.demo.Service;

import com.example.demo.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public int insert(String name, Integer age){
       return  userMapper.insert(name,age);
    }
}
