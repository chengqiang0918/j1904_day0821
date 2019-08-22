package com.j1904.service.impl;

import com.j1904.mapper.UserTableMapper;
import com.j1904.pojo.UserTable;
import com.j1904.pojo.UserTableExample;
import com.j1904.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserTableMapper userTableMapper;

    @Override
    public List<UserTable> findAll() {
        return userTableMapper.findAll();
    }
}
