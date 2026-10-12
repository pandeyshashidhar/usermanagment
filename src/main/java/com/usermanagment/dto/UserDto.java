package com.usermanagment.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDto {

    private String email;
    private String password;
    private String phoneNumber;
    private List<UserAddressDto> addressDtoList = new ArrayList<>();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<UserAddressDto> getAddressDtoList() {
        return addressDtoList;
    }

    public void setAddressDtoList(List<UserAddressDto> addressDtoList) {
        this.addressDtoList = addressDtoList;
    }
}
