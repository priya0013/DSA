# Write your MySQL query statement below
select employeeUNI.unique_id,Employees.name from Employees left join EmployeeUNI on Employees.id=employeeUNI.id;