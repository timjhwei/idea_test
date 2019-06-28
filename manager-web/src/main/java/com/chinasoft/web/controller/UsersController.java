package com.chinasoft.web.controller;

import com.chinasoft.pojo.Users;
import com.chinasoft.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users users){
        usersService.addUser(users);
        return "ok";
    }
}
