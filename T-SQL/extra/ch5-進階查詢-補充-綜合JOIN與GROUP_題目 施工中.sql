use DB01
go

  
--璸衡 场(department_id) キА の 羆 salary,计

  SELECT  department_id, avg(salary), sum(salary), count(*)
  FROM    employees
  GROUP   BY  department_id;


--琩高 ﹎(last_name),羱戈(salary),场絪腹(department_id) の┮妮场嘿(department_name)  

  SELECT   last_name, salary, e.department_id, department_name
  FROM    employees e join departments d
  ON      e.department_id = d.department_id
 
--璸衡 场嘿(department_name) キА の 羆 salary ,计

  SELECT  department_name, avg(salary), sum(salary), count(*)
  FROM    employees e join departments d
  ON      e.department_id = d.department_id
  GROUP   BY department_name

--璸衡 场嘿(department_id, department_name) キА の 羆 salary ,计

  SELECT d.department_id, department_name, avg(salary), sum(salary), count(*)
  FROM    employees e join departments d
  ON     e.department_id = d.department_id
  GROUP   BY  department_name , d.department_id
    

--肂絤策 
--琩高 め璹虫灿戈

       Customers       (CustomerID) 
       Orders          (OrderID, CustomerID)
       [Order Details] (OrderID, ProductID)
       Products        (ProductID)

USE Northwind
go



