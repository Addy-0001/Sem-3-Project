package com.example.gymfitpro.service;

import com.example.gymfitpro.entity.PostEntity;

import java.util.List;

public interface PostService {
    List<PostEntity> getAllPosts();

    PostEntity createPost(PostEntity postEntity);
}
