create database if not exists lecture;
create user 'scott'@'localhost' identified by 'tiger';
grant all privileges on *.* to 'scott'@'localhost';
flush privileges;
use lecture;
create table IF NOT EXISTS dept(
  deptno     int,   
  dname      varchar(14),   
  loc        varchar(13)
);
insert into dept values(20, 'RESEARCH', 'DALLAS');
insert into dept values(30, 'SALES', 'CHICAGO');
insert into dept values(40, 'OPERATIONS', 'BOSTON');