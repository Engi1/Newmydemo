package com.example.mydemo.domain.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mydemo.domain.user.mapper.UserMapper;
import com.example.mydemo.domain.user.model.User;

import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getUsers() {
        return userMapper.findAll();
    }

    @Override
    public User getUser(Long id) {
        return userMapper.findById(id);
    }

    @Override
    @Transactional
    public Long createUser(User user) {
        userMapper.insert(user);
        return user.getUserId();
    }
}
