package com.example.gymfitpro.controller;

import com.example.gymfitpro.entity.PostEntity;
import com.example.gymfitpro.service.PostService;
import com.example.gymfitpro.service.impl.PostServiceImpl;
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
