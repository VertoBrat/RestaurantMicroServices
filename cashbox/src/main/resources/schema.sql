drop table if exists items_orders;
drop table if exists orders;
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

create table orders
(
  id     serial  not null
    constraint orders_pk
      primary key,
  operator VARCHAR(255) not null
);

create table items_orders
(
  order_id integer not null
    constraint items_orders_orders_id_fk
      references orders,
  item_id  integer not null
    constraint items_orders_items_id_fk
      references items
);