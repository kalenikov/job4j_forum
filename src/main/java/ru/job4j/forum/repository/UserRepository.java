package ru.job4j.forum.repository;

import ru.job4j.forum.model.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);

    Optional<User> findByName(String name);
}
