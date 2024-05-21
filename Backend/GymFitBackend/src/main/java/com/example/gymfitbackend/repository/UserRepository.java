package com.example.gymfitbackend.repository;

import com.example.gymfitbackend.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
