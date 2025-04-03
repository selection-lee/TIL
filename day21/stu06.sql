create table stu06(
num number primary key,
name varchar2(6),
gender char(3) check (gender in ('m', 'f'))
-- 남,여만 입력할 수 있는. 아까 05는 참조햇는데 이번엔 하나로.
);