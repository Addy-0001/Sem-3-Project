package com.example.gymfitbackend.service;

import com.example.gymfitbackend.entity.PostEntity;

import java.util.List;

public interface PostService {
    List<PostEntity> getAllPosts();

    PostEntity createPost(PostEntity postEntity);
}
