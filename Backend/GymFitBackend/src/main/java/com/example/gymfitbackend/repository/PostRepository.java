package com.example.gymfitbackend.repository;

import com.example.gymfitbackend.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends  JpaRepository<PostEntity, Long> {
}
