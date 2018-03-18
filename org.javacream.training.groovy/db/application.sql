create table messages (message varchar(256))
create table books (isbn varchar(256), title varchar (256), pages integer, price double, available boolean, publisingDate date, primary key(isbn))
insert into books values ('ISBN1', 'Title1', 200, 19.99)
insert into books values ('ISBN2', 'Title2', 220, 9.99)
insert into books values ('ISBN3', 'Title3', 240, 29.99)
select * from books
-- drop table books
-- drop table messages