SELECT 시간
FROM (SELECT MAX(DATETIME) AS 시간 FROM ANIMAL_INS) AS TIMETABLE;
