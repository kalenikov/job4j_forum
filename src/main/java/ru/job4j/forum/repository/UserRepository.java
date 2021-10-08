package ru.job4j.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.job4j.forum.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
