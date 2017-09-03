package com.example.project.service;

import com.example.project.domain.Post;
import com.example.project.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public void create(Post post) {
        post.setLastUpdate(new Date());
        System.out.println("Post created: " + post);
        postRepository.save(post);
    }

    public Post getPost(long id) {
        return postRepository.findOne(id);
    }

    public List<Post> getPosts() {
        return (List<Post>) postRepository.findAll();
    }

    public void delete(long id) {
        postRepository.delete(id);
    }

}

