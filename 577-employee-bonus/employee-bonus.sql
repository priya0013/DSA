# Write your MySQL query statement below
select Employee.name,Bonus.bonus
from Employee 
left join Bonus 
on Employee.empid=Bonus.empid
where   bonus is null or bonus<1000;