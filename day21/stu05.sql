drop table stu05;
drop table gender05;

create table stu05(
num number primary key,
name varchar2(5) not null --이름이 없을 순 없으니까,,
);

-- 성별
create table gender05(
gen number(1) primary key, 
ch char(3)
);