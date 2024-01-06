package com.teamdemo.springbootskeleton.service.impl;

import com.teamdemo.springbootskeleton.repository.databaseOne.UserRepository;
import com.teamdemo.springbootskeleton.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
}
