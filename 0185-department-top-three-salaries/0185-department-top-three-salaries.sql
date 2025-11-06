# Write your MySQL query statement below
select d.name as department ,e.name as employee, e.salary 
from
    (select 
         name,salary,departmentid,
         dense_rank() over (partition by departmentid order by salary DESC) AS mbu
     from employee
    ) e
join department d on
e.departmentId = d.id where e.mbu <= 3;
