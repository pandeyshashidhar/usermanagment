package com.usermanagment.service;

import com.usermanagment.dto.UserDto;

public interface UserService {

    void saveUser(UserDto userDto);
    void updateUser();
}
