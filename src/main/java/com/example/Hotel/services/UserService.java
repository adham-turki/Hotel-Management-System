package com.example.Hotel.services;

import com.example.Hotel.entities.User;

import java.util.List;

public interface UserService {
    User registerUser(User user);
    User updateUser(User user);
    User getUserById(Integer id);
    User getUserByEmail(String email);
    void deleteUser(Integer id);
    boolean checkPassword(User user, String rawPassword);

    List<User> getAllUsers(); // New method for fetching all users

}
