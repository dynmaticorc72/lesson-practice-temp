
---------------------------- 3-1-3 ------------------------------------
select employee_id,last_name, job_id, hire_date as 'STARTDATE'
from employees

---------------------------- 3-1-4 ------------------------------------
select distinct job_id
from employees


---------------------------- 3-1-5 ------------------------------------
select last_name + ' , ' +  job_id as 'Employee and Title.' 
from employees

---------------------------- 3-2-1 ------------------------------------
select employee_id,last_name, department_id
from employees
where employee_id = 176
---------------------------- 3-2-2 ------------------------------------
select last_name, salary
from employees
where salary<= 5000 or salary >= 12000

select last_name, salary
from employees
where salary not between 5000 and 12000

---------------------------- 3-2-3 ------------------------------------
select last_name, department_id
from employees
where department_id in (20,50)
order by last_name
---------------------------- 3-2-4 ------------------------------------
select last_name, hire_date
from employees
where hire_date like '1994%'
---------------------------- 3-2-5 ------------------------------------
select last_name, salary,commission_pct
from employees
order by salary,commission_pct
---------------------------- 3-3-1 ------------------------------------
select  employee_id, last_name, salary, round(salary*1.15, 0) as 'New Salary'
from employees
order by salary,commission_pct
---------------------------- 3-3-2 ------------------------------------
select  last_name,  LOWER(last_name) as 'last_name1' , LEN(last_name)as 'length'
from employees
where last_name like '[JAM]%'
order by last_name
---------------------------- 3-3-3 ------------------------------------
select  last_name,  datediff(month , hire_date, getdate()) as 'MONTHS_WORKED' ,
from employees
order by MONTHS_WORKED
---------------------------- 3-3-4 ------------------------------------
select last_name, commission_pct, 
       isnull(convert (varchar(40),commission_pct),'No Commission') as 'COMM'
from employees
---------------------------- 3-3-5 ------------------------------------
select last_name, job_id,
	case job_id
	     when 'AD_PRES'  then 'A'
		 when 'ST_MAN'   then 'B'
		 when 'IT_PROG'  then 'C'
		 when 'SA_REP'   then 'D'
		 when 'ST_CLERK' then 'E'
		 else '0'
    end  as grade
from employees
---------------------------- 4-1-1 ------------------------------------
select  round(max(salary),0),
        round(min(salary),0),
        round(sum(salary),0),
		round(avg(salary),0)
from employees
---------------------------- 4-1-2 ------------------------------------
select job_id,
        round(max(salary),0),
        round(min(salary),0),
        round(sum(salary),0),
		round(avg(salary),0)
from employees
group by job_id
---------------------------- 4-1-3 ------------------------------------
select job_id, count(*)      
from employees
group by job_id
---------------------------- 4-1-4 ------------------------------------
select max(salary)-min(salary)  as 'DIFFERENCE'    
from employees
---------------------------- 4-1-5 ------------------------------------
select manager_id, min(salary) as 'min'    
from employees
group by manager_id
having min(salary) >= 6000
order by 'min' desc

---------------------------- 5-1-1 ------------------------------------
select last_name, e.department_id, department_name
from employees e join departments d
on e.department_id = d.department_id

---------------------------- 5-1-2 ------------------------------------
select distinct last_name, e.department_id, job_id, location_id
from employees e join departments d
on e.department_id = d.department_id
where e.department_id = 80
---------------------------- 5-1-3 ------------------------------------
select  commission_pct,last_name, department_name, l.location_id, city
from employees e join departments d
on e.department_id = d.department_id
join locations l
on  d.location_id = l.location_id

---------------------------- 5-1-4 ------------------------------------
select w.last_name as 'Employee', w.employee_id as 'Emp#', m.last_name as 'Manager',
       m.employee_id as 'Mgr#'
from employees m join employees w
on m.employee_id = w.manager_id


---------------------------- 5-1-5 ------------------------------------
select w.last_name as 'Employee', w.employee_id as 'Emp#', m.last_name as 'Manager',
       m.employee_id as 'Mgr#'
from employees m right outer join employees w
on m.employee_id = w.manager_id


---------------------------- 6-1-1 ------------------------------------
select last_name, hire_date
from employees
where  department_id=(select department_id
       from employees
	   where last_name = 'Zlotkey') and last_name != 'Zlotkey'
---------------------------- 6-1-2 ------------------------------------
select last_name, salary
from employees
where  salary>=(select avg(salary)
       from employees)
order by salary 
---------------------------- 6-1-3 ------------------------------------
select employee_id, last_name
from employees
where  department_id in (select department_id
       from employees
	   where last_name like '%u%') 
order by salary 
---------------------------- 6-1-4 ------------------------------------
SELECT last_name, salary
FROM   employees
WHERE  manager_id = (SELECT employee_id
                     FROM   employees
                     WHERE  last_name = 'King')
 

---------------------------- 6-1-5 ------------------------------------

SELECT department_id, last_name, job_id
FROM   employees 
WHERE  department_id =   (SELECT department_id
                          FROM   departments
                          WHERE  department_name = 'Executive')

