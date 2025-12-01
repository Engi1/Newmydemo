package com.example.mydemo.domain.user.service;

import java.util.List;
import com.example.mydemo.domain.user.model.User;

public interface UserService {
    List<User> getUsers();
    User getUser(Long id);
    Long createUser(User user);
}
