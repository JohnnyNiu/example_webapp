package com.example.project.controller;

import com.example.project.domain.Post;
import com.example.project.service.PostService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "post/create", method = GET)
    public String createBlogForm(Model model, Post post) {
        model.addAttribute("post", post);
        postService.create(post);
        return "createPost";
    }

    @RequestMapping(value = "post/create", method = POST)
    public String createBlog(Model model, Post post) {
        model.addAttribute("post", post);
        postService.create(post);
        return "redirect:/posts/"+post.getId();
    }

    @RequestMapping(value = "posts/{id}", method = GET)
    public String getPost(Model model, @PathVariable long id) {
        model.addAttribute("post", postService.getPost(id));
        return "post";
    }

    @RequestMapping(value = "posts", method = GET)
    public String getPosts(Model model) {
        model.addAttribute("posts", postService.getPosts());
        return "posts";
    }

    @RequestMapping(value = "posts/{id}/delete",method = GET)
    public String deletePost(@PathVariable long id){
        postService.delete(id);
        return "redirect:/posts";
    }
}
