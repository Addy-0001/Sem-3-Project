package com.example.gymfitbackend.service.impl;

import com.example.gymfitbackend.entity.UserEntity;
import com.example.gymfitbackend.service.UserService;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl extends UserService {
    @Override
    List<UserEntity> getAllUsers(){
        List<UserEntity> userEntities = new ArrayList<>();

        return userEntities;

    }
    @Override
    UserEntity getUserById(int id){

    }

    @Override
    UserEntity createUser(UserEntity user){

    }

    @Override
    UserEntity updateUser(UserEntity user){

    }

    @Override
    void deleteUser(int id){

    }
}
