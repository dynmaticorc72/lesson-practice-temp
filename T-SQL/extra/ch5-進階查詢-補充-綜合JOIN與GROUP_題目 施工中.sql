use DB01
go

  
--�p�� �U����(department_id) ���� �� �`�X salary,�H��

  SELECT  department_id, avg(salary), sum(salary), count(*)
  FROM    employees
  GROUP   BY  department_id;


--�d�� �U���u�m�W(last_name),�~��(salary),�����s��(department_id) �Ω��ݳ����W��(department_name)  

  SELECT   last_name, salary, e.department_id, department_name
  FROM    employees e join departments d
  ON      e.department_id = d.department_id
 
--�p�� �U�����W��(department_name) ���� �� �`�X salary ,�H��

  SELECT  department_name, avg(salary), sum(salary), count(*)
  FROM    employees e join departments d
  ON      e.department_id = d.department_id
  GROUP   BY department_name

--�p�� �U�����W��(department_id, department_name) ���� �� �`�X salary ,�H��

  SELECT d.department_id, department_name, avg(salary), sum(salary), count(*)
  FROM    employees e join departments d
  ON     e.department_id = d.department_id
  GROUP   BY  department_name , d.department_id
    

--�B�~�m�� 
--�d�� �Ȥ�q����Ӹ��

       Customers       (CustomerID) 
       Orders          (OrderID, CustomerID)
       [Order Details] (OrderID, ProductID)
       Products        (ProductID)

USE Northwind
go



