create table stu02(
num number,
name varchar2(6),
kor number,
eng number,
math number,
-- ���� ���������� �������� ��? �ٵ� ���� �������ְ�ʹ� �ϸ� �̷��� �ּ��� ������ �ȴ�
primary key(num),
unique(name)
);