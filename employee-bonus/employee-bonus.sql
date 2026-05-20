# Write your MySQL query statement below
select E.name,B.bonus from Employee E left join Bonus B on E.empid=B.empid where bonus<1000 or bonus is NULL;