# Write your MySQL query statement below
select a.machine_id,ROUND(AVG(b.timestamp-a.timestamp),3) AS processing_time
from activity a,activity b
where a.machine_id=b.machine_id AND a.process_id=b.process_id and a.activity_type='start' and b.activity_type='end'
group by machine_id