drop database if exists testdb3;
create database testdb3;
use testdb3;

create table users3(
user_id int primary key auto_increment,
user_name varchar(255),
password varchar(255)
);

insert into users3 values(1,"taro","123");
insert into users3 values(2,"jiro","456");
insert into users3 values(3,"hanako","789");

create table inquiry(
name varchar(255),
qtype varchar(255),
body varchar(255)
);
