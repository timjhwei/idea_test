package com.chinasoft.service.impl;

import com.chinasoft.mapper.UsersMapper;
import com.chinasoft.pojo.Users;
import com.chinasoft.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {
        usersMapper.insertUser(users);
    }
}
