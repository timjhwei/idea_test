package com.chinasoft.mapper;

import com.chinasoft.pojo.Users;

import java.util.List;

public interface UsersMapper  {

    void insertUser(Users users);
    List<Users> selectUserAll();

}
