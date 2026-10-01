drop table if exists std;

create table sdt(
    id int primary key,
   sdt_name varchar(100),
    age int,
    usn int
);
insert into sdt values (1, 'puneeth', 19, 25);
insert into sdt values (2, 'ajay', 18, 525);
insert into sdt values (3,'ai',29,2546);
insert into sdt values (4,'a',20,267);
select*from sdt;
select*from sdt where sdt_name='puneeth';
select*from sdt where usn=12234;
select*from sdt where age<20;
update sdt
set usn =0998
where id=1;
select*from sdt;
delete from sdt  
where id=3;
select*from sdt;	
select*from sdt
where age="19" and sdt_name="puneeth";
select *from sdt
where age >18 and age<20;