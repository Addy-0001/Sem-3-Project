package com.example.gymfitpro.repository;

import com.example.gymfitpro.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends  JpaRepository<PostEntity, Long> {
}
