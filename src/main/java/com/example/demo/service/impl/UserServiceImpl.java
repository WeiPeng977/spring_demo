package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope("prototype")
public class UserServiceImpl implements UserService {
    private List<User> userList = new ArrayList<>();

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    @Override
    public User addUser(User user) {
        userList.add(user);
        return user;
    }
}
