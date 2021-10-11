insert into posts (name)
values ('About');
insert into posts (name)
values ('Rules');

insert into roles(name)
values ('ROLE_ADMIN'),
       ('ROLE_USER');

insert into users(username, password, role_id)
VALUES ('admin',
        '$2a$10$kHUgz24PZRj8IK1ebedLfuSX6ruAi/JBM2lGKX981ItCTgwZE8/Se',
        (select id from roles where name = 'ROLE_ADMIN'));

insert into users(username, password, role_id)
VALUES ('user',
        '$2a$10$kHUgz24PZRj8IK1ebedLfuSX6ruAi/JBM2lGKX981ItCTgwZE8/Se',
        (select id from roles where name = 'ROLE_USER'));