drop table stu02;
drop table gender02;
--
create table gender02(
num1 number CONSTRAINT gender02_num1_pk primary key,
ch char(1)
);
insert into gender02 values (1, 'm');
insert into gender02 values (2, 'f');
create table stu02(
num number,
name varchar2(6),
gen number,
kor number,
eng number,
math number,
-- �ּ�
CONSTRAINT stu02_num_pk primary key(num),
CONSTRAINT stu02_num_uk unique(name),
CONSTRAINT stu02_num_fk FOREIGN KEY(gen) REFERENCES gender02(num1)
);