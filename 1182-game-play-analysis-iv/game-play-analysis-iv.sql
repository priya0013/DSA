# Write your MySQL query statement below


select round(count(distinct case 
when datediff(a.event_date,b.first_date)=1 then a.player_id end)/count(distinct b.player_id),2) as fraction
from activity a
join (select player_id , min(event_date) as first_date from activity group by player_id) b
on a.player_id=b.player_id;