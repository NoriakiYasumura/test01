drop database if exists testdbj5;
create database testdbj5;
use testdbj5;

create table usersj5(
user_id int primary key auto_increment,
user_name varchar(255),
password varchar(255)
);

insert into usersj5 values(1,"taro","123");
insert into usersj5 values(2,"jiro","456");
insert into usersj5 values(3,"hanako","789");

create table inquiryj5(
name varchar(255),
qtype varchar(255),
body varchar(255)
);