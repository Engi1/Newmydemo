package com.example.mydemo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.mydemo.domain.user.model.User;
import com.example.mydemo.domain.user.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping
    public Long createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}