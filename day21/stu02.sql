create table stu02(
num number,
name varchar2(6),
kor number,
eng number,
math number,
-- 여기 공백있으면 오류나는 듯? 근데 나는 구분해주고싶다 하면 이렇게 주석을 넣으면 된다
primary key(num),
unique(name)
);