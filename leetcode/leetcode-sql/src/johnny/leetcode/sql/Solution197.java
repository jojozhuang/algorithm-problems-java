package johnny.leetcode.algorithm;

/**
 * 197. Rising Temperature
 * Given a Weather table, write a SQL query to find all dates' Ids with higher temperature compared to its previous (yesterday's) dates.

+---------+------------------+------------------+
| Id(INT) | RecordDate(DATE) | Temperature(INT) |
+---------+------------------+------------------+
|       1 |       2015-01-01 |               10 |
|       2 |       2015-01-02 |               25 |
|       3 |       2015-01-03 |               20 |
|       4 |       2015-01-04 |               30 |
+---------+------------------+------------------+
For example, return the following Ids for the above Weather table:

+----+
| Id |
+----+
|  2 |
|  4 |
+----+
(123) 456-7890
 * @author Johnny
 */
public class Solution197 {
    public int query() {
        return 0;
    }
    //# Write your MySQL query statement below
    /*
    Create table If Not Exists Weather (Id int, RecordDate date, Temperature int);
    Truncate table Weather;
    insert into Weather (Id, RecordDate, Temperature) values ('1', '2015-01-01', '10');
    insert into Weather (Id, RecordDate, Temperature) values ('2', '2015-01-02', '25');
    insert into Weather (Id, RecordDate, Temperature) values ('3', '2015-01-03', '20');
    insert into Weather (Id, RecordDate, Temperature) values ('4', '2015-01-04', '30');
    */

    /*
    SELECT w1.Id
    FROM Weather w1, Weather w2
    WHERE w1.RecordDate = DATE_ADD(w2.RecordDate,INTERVAL 1 DAY) AND w1.Temperature > w2.Temperature
    */
}
