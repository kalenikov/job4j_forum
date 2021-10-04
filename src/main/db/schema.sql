create table posts
(
    id          serial primary key,
    name        varchar(2000),
    text text,
    created     timestamp without time zone not null default now()
);

insert into posts (name)
values ('About');
insert into posts (name)
values ('Rules');