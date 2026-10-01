drop table if exists emp;

create table emp (
    id int primary key,
    name varchar(100),
    age int,
    salary int
);

insert into emp values (1, 'puneeth', 19, 35000);
insert into emp values (2, 'ajay', 19, 5000000);
insert into emp values (3,'ai',19,20000);
insert into emp values (4,'a',20,20000);
select*from emp;