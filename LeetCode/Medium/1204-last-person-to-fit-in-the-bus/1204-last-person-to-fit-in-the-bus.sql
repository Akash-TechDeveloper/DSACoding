SELECT person_name
FROM (
  SELECT person_name,turn,
        SUM(weight) OVER (ORDER BY turn) AS tw
  FROM Queue
) t
WHERE tw <=1000
ORDER BY t.turn DESC
LIMIT 1;
