package ru.job4j.forum.repository;


import ru.job4j.forum.model.Post;

import java.util.List;

public interface PostRepository {
    List<Post> findAll();

    Post save(Post post);

    Post findById(int id);

}
