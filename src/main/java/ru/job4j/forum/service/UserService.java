package ru.job4j.forum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.job4j.forum.model.User;
import ru.job4j.forum.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository users;

    public User save(User user) {
        return users.save(user);
    }

    public Optional<User> findByName(String name) {
        return users.findByName(name);
    }
}