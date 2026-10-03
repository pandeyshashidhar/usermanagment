package com.usermanagment.service.impl;

import com.usermanagment.dao.UserRepository;
import com.usermanagment.dto.UserDto;
import com.usermanagment.entity.UserEntity;
import com.usermanagment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String saveUser(UserDto userDto) {

        try {

            String phoneNumber = userDto.getPhoneNumber();
            phoneNumber = "+91" + phoneNumber;
            userDto.setPhoneNumber(phoneNumber);

            //convert data from dto to entity class
            UserEntity userEntity = new UserEntity();
            userEntity.setEmail(userDto.getEmail());
            userEntity.setPassword(userDto.getPassword());
            userEntity.setPhoneNumber(userDto.getPhoneNumber());
            userRepository.save(userEntity);
        }catch (Exception e){

            e.printStackTrace();
            return "User data not save in DB";

        }
        return "User data Saved successfully";
    }

    @Override
    public String updateUser(UserDto userDto) {

        UserEntity userEntity = userRepository.findByEmail(userDto.getEmail());
        if(userEntity!=null){
            String phoneNumber = userDto.getPhoneNumber();
            phoneNumber = "+91" + phoneNumber;
            userDto.setPhoneNumber(phoneNumber);
            userEntity.setPhoneNumber(userDto.getPhoneNumber());
            userEntity.setPassword(userDto.getPassword());
            userRepository.save(userEntity);
        }else{
            return "User email is not found in DB";
        }
        return "User data updated successfully";
    }

    @Override
    public String deleteUser(String email) {
        UserEntity userEntity = userRepository.findByEmail(email);
        if(userEntity!=null) {
            userRepository.delete(userEntity);
        }else{
            return "User email is not found in DB";
        }
        return "User data deleted successfully";
    }
}
