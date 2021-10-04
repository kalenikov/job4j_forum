package ru.job4j.forum.repository.mem;


import org.springframework.stereotype.Repository;
import ru.job4j.forum.model.User;
import ru.job4j.forum.repository.UserRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class InMemoryUserRepository implements UserRepository {
    private final Map<Integer, User> store = new HashMap<>();
    private final AtomicInteger counter = new AtomicInteger(0);

    public InMemoryUserRepository() {
        store.put(1, User.of(1, "user1", "123"));
        store.put(2, User.of(1, "user2", "123"));
    }

    @Override
    public User save(User user) {
        user.setId(counter.incrementAndGet());
        store.put(user.getId(), user);
        return user;
    }

    @Override
    public Optional<User> findByName(String name) {
        return store.values().stream()
                .filter(user -> user.getUsername().equals(name))
                .findFirst();
    }
}