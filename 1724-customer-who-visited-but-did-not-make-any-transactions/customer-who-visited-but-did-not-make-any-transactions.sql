SELECT v.customer_id,
       COUNT(v.visit_id) AS count_no_trans
FROM visits v
LEFT JOIN Transactions t USING(visit_id)
WHERE t.transaction_id IS NULL
GROUP BY v.customer_id
ORDER BY v.customer_id;
