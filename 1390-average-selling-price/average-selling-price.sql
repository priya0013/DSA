# Write your MySQL query statement below
select p.product_id, ifnull(Round(SUM(units*price)/SUM(units),2),0) AS average_price
from prices p
left join unitssold u ON p.product_id=u.product_id AND u.purchase_date BETWEEN start_date AND end_date
group by p.product_id;