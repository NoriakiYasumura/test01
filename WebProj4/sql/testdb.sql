drop database if exists testdb_j4;
create database testdb_j4;
use testdb_j4;

create table users_j4(user_id int primary key auto_increment,
user_name varchar(255),
password varchar(255)
);

insert into users_j4 values(1,"taro","123");
insert into users_j4 values(2,"jiro","456");
insert into users_j4 values(3,"hanako","789");

create table inquiry_j4(
name varchar(255),
qtype varchar(255),
body varchar(255)
);
