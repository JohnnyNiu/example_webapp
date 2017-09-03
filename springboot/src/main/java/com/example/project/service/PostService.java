package com.example.project.service;

import com.example.project.domain.Post;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PostService {

    public void create(Post post) {
        post.setLastUpdate(new Date());
        System.out.println("Post created: " + post);
    }
}
