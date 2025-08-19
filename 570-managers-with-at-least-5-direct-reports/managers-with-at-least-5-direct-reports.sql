# Write your MySQL query statement below
select x.name 
from employee x
join employee y
on x.id=y.managerid
group by y.managerid
having count(*)>=5;