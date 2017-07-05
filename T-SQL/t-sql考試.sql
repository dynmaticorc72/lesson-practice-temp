select * from prod where edate between'2015-09-12' and '2015-09-14'
select * from member
select * from bid 

select mno,pname from prod where pname = 'CD-PRO2'

select mno,pname from prod where pname like '%主機板%'

select m.mno,name,pname from prod p join member m on p.mno=m.mno where pname = 'CD-PRO2'

select pclass, count(*) from prod group by pclass

select pno, mno, bdate, bprice from bid where pno = 5

select pno, name, bdate, bprice from bid b join member m on b.mno=m.mno where pno = 5

select p.pno, name, bdate, b.bprice 
from bid b join member m on b.mno=m.mno 
           join prod p on p.pno=b.pno
where b.pno = 5


insert into prod ( pclass, pname, bprice, edate, mno)
 values ('休閒類','烤肉架',200,'2015-09-20',122)

delete from bid where mno = 123 and pno = 3

update member set addr = '台北市中山北路100號' where mno = 123

select pclass , pname from prod where pclass in (select pclass from prod where pname='IBM R51')


SELECT LTRIM(RTRIM(‘hello ’)) 
SELECT RIGHT('hello', 3) 