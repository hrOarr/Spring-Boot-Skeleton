package com.teamdemo.springbootskeleton.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/users")
public class UserController {

    @GetMapping(value = "/{id}")
    public String test(
            HttpServletRequest request,
            @PathVariable(value = "id") String id){
        return "Hello from TEST";
    }

}
