--於新增資料時自動產生識別 identity或流水號, 
--及透過觸發程式重組為特定格式
--ex  1,2,3 -->  T10000001,  T10000002,  T10000003

--建測試表格
create table T1
(id   int identity(1,1),    --識別流水號數字
 sid  char(10),             --觸發程式產生之識別流水號格式
 name varchar(10)
);
go

select cast(datename( yyyy, getdate() ) - 1911  as varchar(4)) +cast(datepart( mm, getdate()) as varchar(2))+ 
     cast( datename( dd, getdate()) as varchar(2))



select format (month( getdate()),'00')

--建立觸發程式
alter trigger tri_t1
on T1
AFTER INSERT
AS
BEGIN
 declare @v_sid char(10);
 
 --重組流水號格式 前面加  T1 後面補滿 7個0   '000' + '5' == 0005  106xxoo+3
 select @v_sid =  cast(datename( yyyy, getdate() ) - 1911  as varchar(4)) +format (month( getdate()),'00')+ 
     cast( datename( dd, getdate()) as varchar(2))+ right('000'+convert(varchar(8), id),3)
 from INSERTED

 --將重組格式寫入表格中
 update T1 set sid = @v_sid FROM T1 JOIN INSERTED I
 ON T1.id = I.id
 
END;
go

--測試
insert into T1(name) values ('PC1');
insert into T1(name) values ('PC2');
insert into T1(name) values ('PC3');
insert into T1(name) values ('PC7');
--查

select * from T1;

1           T100000001 PC1
2           T100000002 PC2
3           T100000003 PC3
