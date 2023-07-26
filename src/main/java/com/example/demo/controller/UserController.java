package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        Thread thread = Thread.currentThread();
        Long threadId = thread.getId();
        System.out.println("get threadId is : " + threadId);
        return userService.getAllUsers();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        Thread thread = Thread.currentThread();
        Long threadId = thread.getId();
        System.out.println("post threadId is : " + threadId);
        return userService.addUser(user);
    }
}
