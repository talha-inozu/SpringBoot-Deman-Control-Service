package com.nirengi.dcs.controller;

import com.nirengi.dcs.dto.UserDto;
import com.nirengi.dcs.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserServiceController {

    @Autowired
    UserService userService;


    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<UserDto> getAllUsers(){
        return  userService.getAllUsers();
    }


}
