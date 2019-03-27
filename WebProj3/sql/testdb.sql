drop database if exists testdb_j3;
create database testdb_j3;
use testdb_j3;

create table users_j3(
user_id int primary key auto_increment,
user_name varchar(255),
password varchar(255)
);

insert into users_j3 values(1,"taro","123");
insert into users_j3 values(2,"jiro","456");
insert into users_j3 values(3,"hanako","789");

create table inquiry_j3(
name varchar(255),
qtype varchar(255),
body varchar(255)
);