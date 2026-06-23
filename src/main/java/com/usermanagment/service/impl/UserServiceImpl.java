package com.usermanagment.service.impl;

import com.usermanagment.dto.UserDto;
import com.usermanagment.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void saveUser(UserDto userDto) {

        String phoneNumber = userDto.getPhoneNumber();
        phoneNumber = "+91"+phoneNumber;
        userDto.setPhoneNumber(phoneNumber);

    }

    @Override
    public void updateUser() {

    }
}
