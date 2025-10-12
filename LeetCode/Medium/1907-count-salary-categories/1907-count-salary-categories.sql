# Write your MySQL query statement below
SELECT "Low Salary" as category, sum(if(income<20000,1,0)) AS accounts_count FROM Accounts
union all
SELECT "Average Salary" as category, sum(if(income>=20000 and income<=50000,1,0)) AS accounts_count FROM Accounts
union all
SELECT "High Salary" as category, sum(if(income>50000,1,0)) AS accounts_count FROM Accounts