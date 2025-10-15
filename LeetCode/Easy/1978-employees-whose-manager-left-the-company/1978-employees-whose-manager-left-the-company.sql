select employee_id
from employees as a
where manager_id not in (
select employee_id from employees) and
salary < 30000
order by employee_id asc;