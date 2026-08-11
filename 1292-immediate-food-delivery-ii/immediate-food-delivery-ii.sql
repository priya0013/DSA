# Write your MySQL query statement below


#here (order_date=customer_pref_delivery_date)
#this line return == 1 ,!= 0 then of only first order avg(0+1+0+1)/4==50%
select round(avg(order_date=customer_pref_delivery_date)*100,2) as immediate_percentage
from delivery
where (customer_id,order_date) in(select customer_id,min(order_date) from delivery group by customer_id);