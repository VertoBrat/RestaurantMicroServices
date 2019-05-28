delete from items_orders;
delete from orders;
delete from items;

insert into items (name, price, enable) values
('soup', 90, true),
('juice', 100, true);