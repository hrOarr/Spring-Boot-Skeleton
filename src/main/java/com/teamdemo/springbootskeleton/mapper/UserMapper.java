package com.teamdemo.springbootskeleton.mapper;

import com.teamdemo.springbootskeleton.dto.UserDto;
import com.teamdemo.springbootskeleton.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User toEntity(){
        return new User();
    }

    public UserDto toDto(){
        return new UserDto();
    }
}