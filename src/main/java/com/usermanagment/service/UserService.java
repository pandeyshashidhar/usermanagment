package com.usermanagment.service;

import com.usermanagment.dto.UserDto;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserService {

    String saveUser(UserDto userDto);
    String updateUser(UserDto userDto);
    String deleteUser(String email);
}
