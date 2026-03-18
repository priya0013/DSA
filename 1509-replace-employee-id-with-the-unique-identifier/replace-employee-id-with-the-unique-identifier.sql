# Write your MySQL query statement below
select e.unique_id,ed.name from employees ed
left join employeeUNI e
on e.id=ed.id;
