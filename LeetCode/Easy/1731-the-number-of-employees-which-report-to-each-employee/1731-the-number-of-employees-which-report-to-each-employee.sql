select e1.employee_id, e1.name, (select count(e2.employee_id) from Employees e2 where e2.reports_to = e1.employee_id) as reports_count, (select round(avg(e2.age)) from Employees e2 where e2.reports_to = e1.employee_id) as average_age
from Employees e1
having reports_count>0
order by e1.employee_id