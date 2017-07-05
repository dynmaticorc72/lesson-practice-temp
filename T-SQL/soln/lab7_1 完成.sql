CREATE TABLE MY_EMPLOYEE
(ID         INT CONSTRAINT MY_EMPLOYEE_ID_NN   NOT NULL,
 LAST_NAME  VARCHAR(25),
 FIRST_NAME VARCHAR(25),
 USERID     VARCHAR(8),
 SALARY     decimal(9,2)
);

insert into my_employee (id, last_name) values (3, ' Dancs')

insert into my_employee values (3, ' Dancs' , null, null , null)

select * from my_employee

update my_employee set last_name = 'Drexler' where id = 3

delete from my_employee  where last_name = 'Drexler'

DELETE FROM my_employee

truncate table my_employee

drop table my_employee