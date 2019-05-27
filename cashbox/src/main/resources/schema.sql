drop table if exists items;

create table items
(
  id serial
    constraint items_pk
    primary key,
  name VARCHAR(255) not null,
  price float default 0 not null,
  enable boolean default false
);