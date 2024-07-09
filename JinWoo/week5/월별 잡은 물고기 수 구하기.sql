SELECT COUNT(*) AS FISH_COUNT ,
        CASE 
            WHEN MONTH(TIME) = 1 THEN 1
            WHEN MONTH(TIME) = 2 THEN 2
            WHEN MONTH(TIME) = 3 THEN 3
            WHEN MONTH(TIME) = 4 THEN 4
            WHEN MONTH(TIME) = 5 THEN 5
            WHEN MONTH(TIME) = 6 THEN 6
            WHEN MONTH(TIME) = 7 THEN 7
            WHEN MONTH(TIME) = 8 THEN 8
            WHEN MONTH(TIME) = 9 THEN 9
            WHEN MONTH(TIME) = 10 THEN 10
            WHEN MONTH(TIME) = 11 THEN 11
            WHEN MONTH(TIME) = 12 THEN 12
            END AS MONTH
FROM FISH_INFO 
GROUP BY MONTH
ORDER BY MONTH

