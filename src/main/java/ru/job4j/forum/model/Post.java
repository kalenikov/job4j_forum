package ru.job4j.forum.model;

import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@AllArgsConstructor(staticName = "of")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Post {
    private int id;
    private String name;
    private String text;
    private Timestamp created = Timestamp.valueOf(LocalDateTime.now());

    public boolean isNew() {
        return id == 0;
    }
}