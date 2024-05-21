package com.example.gymfitbackend.service.impl;

import com.example.gymfitbackend.entity.UserEntity;
import com.example.gymfitbackend.repository.UserRepository;
import com.example.gymfitbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserEntity> getAllUsers() {
        List<UserEntity> userEntities = new ArrayList<>();
        return userEntities;
    }

    @Override
    public UserEntity getUserById(int id) {
        UserEntity userEntity = userRepository.findById(id).orElse(null);
        return userEntity;
    }

    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public UserEntity updateUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
