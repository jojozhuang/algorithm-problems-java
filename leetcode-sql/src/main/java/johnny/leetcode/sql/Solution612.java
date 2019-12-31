package johnny.leetcode.sql;

/**
 * 612. Shortest Distance in a Plane
 * Table point_2d holds the coordinates (x,y) of some unique points (more than two) in a plane.
Write a query to find the shortest distance between these points rounded to 2 decimals.
| x  | y  |
|----|----|
| -1 | -1 |
| 0  | 0  |
| -1 | -2 |
The shortest distance is 1.00 from point (-1,-1) to (-1,2). So the output should be:
| shortest |
|----------|
| 1.00     |
Note: The longest distance among all the points are less than 10000.

 * @author Johnny
 */
public class Solution612 {
    public int query() {
        return 0;
    }
    //# Write your MySQL query statement below
    
    /*
    CREATE TABLE If Not Exists point_2d (x INT NOT NULL, y INT NOT NULL);
    Truncate table point_2d;
    insert into point_2d (x, y) values ('-1', '-1');
    insert into point_2d (x, y) values ('0', '0');
    insert into point_2d (x, y) values ('-1', '-2');
    */
    
    /*
    SELECT
        ROUND(SQRT(MIN((POW(p1.x - p2.x, 2) + POW(p1.y - p2.y, 2)))),2) AS shortest
    FROM
        point_2d p1
            JOIN
        point_2d p2 ON (p1.x <= p2.x AND p1.y < p2.y)
            OR (p1.x <= p2.x AND p1.y > p2.y)
            OR (p1.x < p2.x AND p1.y = p2.y)
    */
}
