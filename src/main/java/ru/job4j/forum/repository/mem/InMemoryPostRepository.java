package ru.job4j.forum.repository.mem;


import org.springframework.stereotype.Repository;
import ru.job4j.forum.model.Post;
import ru.job4j.forum.repository.PostRepository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class InMemoryPostRepository implements PostRepository {
    private final Map<Integer, Post> store = new HashMap<>();
    private final AtomicInteger counter = new AtomicInteger(10);

    public InMemoryPostRepository() {
        store.put(1, Post.of(1, "post1", "text1", Timestamp.valueOf(LocalDateTime.now())));
        store.put(2, Post.of(2, "post2", "text2", Timestamp.valueOf(LocalDateTime.now())));
        store.put(3, Post.of(3, "post3", "text3", Timestamp.valueOf(LocalDateTime.now())));
    }

    @Override
    public List<Post> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Post save(Post post) {
        if (post.isNew()) {
            post.setId(counter.incrementAndGet());
            store.put(post.getId(), post);
            return post;
        }
        return store.computeIfPresent(post.getId(), (k, v) -> post);
    }

    @Override
    public Post findById(int id) {
        return store.get(id);
    }
}
