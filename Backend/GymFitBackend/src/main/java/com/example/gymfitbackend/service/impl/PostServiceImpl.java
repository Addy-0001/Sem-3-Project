package com.example.gymfitbackend.service.impl;

import com.example.gymfitbackend.entity.PostEntity;
import com.example.gymfitbackend.repository.PostRepository;
import com.example.gymfitbackend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<PostEntity> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public PostEntity createPost(PostEntity postEntity) {
        return postRepository.save(postEntity);
    }
}
