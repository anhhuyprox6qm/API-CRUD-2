package com.example.apicrud2.service;

import com.example.apicrud2.model.User;

import java.util.List;

public interface UserService {
    public void saveUser(User user);
    public void deleteUser(Integer id);
    public User findById(Integer id);
    public List<User> findAll();
    public List<User> findAllByNameContainsIgnoreCase(String name);
}
