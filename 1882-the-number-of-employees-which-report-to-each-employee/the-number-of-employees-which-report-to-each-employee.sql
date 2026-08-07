# Write your MySQL query statement below

#see count(col name)  nu kudutha null edukathu count la only value
# but count(*) kudutha all value includes null also

select reports_to as employee_id,(select name from employees e1 where e2.reports_to=e1.employee_id) as name,count(reports_to) as reports_count,round(avg(age)) as average_age
from employees e2
group by reports_to 
having reports_count>0
order by employee_id;