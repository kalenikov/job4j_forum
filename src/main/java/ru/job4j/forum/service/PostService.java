package ru.job4j.forum.service;

import org.springframework.stereotype.Service;
import ru.job4j.forum.model.Post;
import ru.job4j.forum.repository.PostRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository posts;

    public PostService(PostRepository posts) {
        this.posts = posts;
    }

    public List<Post> findAll() {
        return (List<Post>) posts.findAll();
    }

    public Optional<Post> findById(int id) {
        return posts.findById(id);
    }

    public Post save(Post post) {
        return posts.save(post);
    }
}