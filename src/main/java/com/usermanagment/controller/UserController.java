package com.usermanagment.controller;

import com.usermanagment.dto.UserDto;
import com.usermanagment.service.UserService;
import com.usermanagment.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userDetails")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public String saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }

    @PutMapping
    public String updateUser(@RequestBody UserDto userDto){
        return userService.updateUser(userDto);
    }

    @DeleteMapping
    public String deleteUser(@RequestParam String email){
        return userService.deleteUser(email);
    }
}
