create table posts
(
    id      serial primary key,
    name    varchar(2000),
    text    text,
    created timestamp without time zone not null default now()
);

CREATE TABLE roles
(
    id   serial primary key,
    name VARCHAR(50) NOT NULL unique
);

CREATE TABLE users
(
    id       serial primary key,
    username VARCHAR(50)  NOT NULL unique,
    password VARCHAR(100) NOT NULL,
    role_id  int references roles
);