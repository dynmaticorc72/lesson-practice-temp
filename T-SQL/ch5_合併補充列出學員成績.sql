--ch5
--�C�X�ǭ��m�W�ΦU�즨�Z
select * from student
select * from course order by id


select  s.id, s.name, c.id, c.name, c.score
from  student s JOIN course c
ON     s.id = c.id
order by s.id


--�C�X�ǭ��m�W�ΦU�즨�Z (���ѥ[�Ҹժ��ǭ��]�n�C�X)

select  s.id, s.name, c.id, c.name, c.score
from  student s LEFT OUTER JOIN course c
ON     s.id = c.id
order by s.id

--adv ����3��
select distinct name from course

--�C�X�C�H���׬�
/*
select
from  student 23 CROSS JOIN  3
*/

select s.id, s.name, c1.name
from  student s CROSS JOIN  (select distinct name from course) c1
order by s.id

--��� 65  -->69  �t 4�i

select s.id, s.name, c1.name, c.name, c.score
from  student s CROSS JOIN  (select distinct name from course) c1
left outer JOIN  course c
ON  s.id = c.id and
    c1.name = c.name
order by s.id