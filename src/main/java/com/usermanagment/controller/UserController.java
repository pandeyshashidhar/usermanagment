package com.usermanagment.controller;

import com.usermanagment.dto.UserDto;
import com.usermanagment.service.UserService;
import com.usermanagment.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody UserDto userDto){
        userService.saveUser(userDto);
        return "User Saved successfully";
    }

    @PostMapping("/updateUser")
    public String updateUser(){

        return "User Updated successfully";
    }
}
