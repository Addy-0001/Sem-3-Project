package com.example.gymfitbackend.service;

import com.example.gymfitbackend.entity.UserEntity;

import java.util.List;

public interface UserService {
    List <UserEntity> getAllUsers();
    UserEntity getUserById(int id);

    UserEntity createUser(UserEntity user);
    UserEntity updateUser(UserEntity user);
    void deleteUser(int id);
}
