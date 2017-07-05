--��s�W��Ʈɦ۰ʲ����ѧO identity�άy����, 
--�γz�LĲ�o�{�����լ��S�w�榡
--ex  1,2,3 -->  T10000001,  T10000002,  T10000003

--�ش��ժ��
create table T1
(id   int identity(1,1),    --�ѧO�y�����Ʀr
 sid  char(10),             --Ĳ�o�{�����ͤ��ѧO�y�����榡
 name varchar(10)
);
go

select cast(datename( yyyy, getdate() ) - 1911  as varchar(4)) +cast(datepart( mm, getdate()) as varchar(2))+ 
     cast( datename( dd, getdate()) as varchar(2))



select format (month( getdate()),'00')

--�إ�Ĳ�o�{��
alter trigger tri_t1
on T1
AFTER INSERT
AS
BEGIN
 declare @v_sid char(10);
 
 --���լy�����榡 �e���[  T1 �᭱�ɺ� 7��0   '000' + '5' == 0005  106xxoo+3
 select @v_sid =  cast(datename( yyyy, getdate() ) - 1911  as varchar(4)) +format (month( getdate()),'00')+ 
     cast( datename( dd, getdate()) as varchar(2))+ right('000'+convert(varchar(8), id),3)
 from INSERTED

 --�N���ծ榡�g�J��椤
 update T1 set sid = @v_sid FROM T1 JOIN INSERTED I
 ON T1.id = I.id
 
END;
go

--����
insert into T1(name) values ('PC1');
insert into T1(name) values ('PC2');
insert into T1(name) values ('PC3');
insert into T1(name) values ('PC7');
--�d

select * from T1;

1           T100000001 PC1
2           T100000002 PC2
3           T100000003 PC3
