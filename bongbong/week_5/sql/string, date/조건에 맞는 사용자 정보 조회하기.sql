SELECT U.USER_ID, U.NICKNAME, CONCAT(U.CITY,' ',U.STREET_ADDRESS1,' ',U.STREET_ADDRESS2) AS 전체주소,
       CONCAT(SUBSTR(U.TLNO,1,3),'-',SUBSTR(U.TLNO,4,4),'-',SUBSTR(U.TLNO,8,4)) AS 전화번호
FROM USED_GOODS_BOARD B
JOIN USED_GOODS_USER U
ON U.USER_ID = B.WRITER_ID
WHERE B.WRITER_ID IN (
        SELECT DISTINCT(WRITER_ID)
        FROM USED_GOODS_BOARD
        GROUP BY WRITER_ID
        HAVING COUNT(WRITER_ID) >= 3)
GROUP BY U.USER_ID
ORDER BY U.USER_ID DESC;
