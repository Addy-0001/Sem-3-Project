package com.example.gymfitbackend.controller;

import com.example.gymfitbackend.entity.PostEntity;
import com.example.gymfitbackend.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts/")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService){
        this.postService = postService;
    }

    @GetMapping
    public List<PostEntity> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping
    public PostEntity createPost(@RequestBody PostEntity postEntity){
        return postService.createPost(postEntity);
    }

}
