package johnny.leetcode.algorithm;

/**
 * 619. Biggest Single Number
 * Table number contains many numbers in column num including duplicated ones.
Can you write a SQL query to find the biggest number, which only appears once.
+---+
|num|
+---+
| 8 |
| 8 |
| 3 |
| 3 |
| 1 |
| 4 |
| 5 |
| 6 | 
For the sample data above, your query should return the following result:
+---+
|num|
+---+
| 6 |
Note:
If there is no such number, just output null.
 * @author Johnny
 */
public class Solution619 {
    public int query() {
        return 0;
    }
    //# Write your MySQL query statement below
    
    /*
    Create table If Not Exists number (num int);
    Truncate table number;
    insert into number (num) values ('8');
    insert into number (num) values ('8');
    insert into number (num) values ('3');
    insert into number (num) values ('3');
    insert into number (num) values ('1');
    insert into number (num) values ('4');
    insert into number (num) values ('5');
    insert into number (num) values ('6');
    */
    
    /*
    SELECT
        MAX(num) AS num
    FROM
        (SELECT
            num
        FROM
            number
        GROUP BY num
        HAVING COUNT(num) = 1) AS t
    */
}
