# Write your MySQL query statement below
select email as Email from person
group by Email having COUNT(email)>1;