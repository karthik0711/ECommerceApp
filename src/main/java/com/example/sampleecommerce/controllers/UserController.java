package com.example.sampleecommerce.controllers;

import com.example.sampleecommerce.dtos.UserDto;
import com.example.sampleecommerce.models.User;
import com.example.sampleecommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("")
    public User addUser(@RequestBody UserDto userDto) {
        return  userService.createUser(userDto.getName(), userDto.getEmail());
    }
    @RequestMapping("/{name}")
    public Optional<User> getUser(@PathVariable("name") String name) {
        return userService.getUserByName(name);
    }
}
