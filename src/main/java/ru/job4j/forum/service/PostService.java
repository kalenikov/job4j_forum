package ru.job4j.forum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.job4j.forum.model.Post;
import ru.job4j.forum.repository.PostRepository;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository posts;

    public List<Post> findAll() {
        return posts.findAll();
    }

    public Post findById(int id) {
        return posts.findById(id);
    }

     public Post save(Post post) {
        return posts.save(post);
    }
}