create schema if not exists hwsql;

create table if not exists persons
(
    name           varchar(255),
    surname        varchar(255),
    age            int,
    phone_number   varchar(255),
    city_of_living varchar(255),
    primary key (name, surname, age)
);

insert into persons(name, surname, age, phone_number, city_of_living)
values ('Ivan', 'Ivanov', 30, '999888', 'Samara'),
       ('Petr', 'Petrov', 35, '999666', 'Moscow'),
       ('Kot', 'Kotov', 33, '999444', 'Barnaul'),
       ('Sidr', 'Sidorov', 55, '999111', 'Spb')
