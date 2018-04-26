package johnny.algorithm.leetcode;

/**
 * 180. Consecutive Numbers
 * Write a SQL query to find all numbers that appear at least three times consecutively.

+----+-----+
| Id | Num |
+----+-----+
| 1  |  1  |
| 2  |  1  |
| 3  |  1  |
| 4  |  2  |
| 5  |  1  |
| 6  |  2  |
| 7  |  2  |
+----+-----+
For example, given the above Logs table, 1 is the only number that appears consecutively for at least three times.

+-----------------+
| ConsecutiveNums |
+-----------------+
| 1               |
+-----------------+
 * @author Johnny
 */
public class Solution180 {
    /*
    Create table If Not Exists Logs (Id int, Num int);
    Truncate table Logs;
    insert into Logs (Id, Num) values ('1', '1');
    insert into Logs (Id, Num) values ('2', '1');
    insert into Logs (Id, Num) values ('3', '1');
    insert into Logs (Id, Num) values ('4', '2');
    insert into Logs (Id, Num) values ('5', '1');
    insert into Logs (Id, Num) values ('6', '2');
    insert into Logs (Id, Num) values ('7', '2');
    */
    
    /*
    SELECT DISTINCT
        l1.Num AS ConsecutiveNums
    FROM
        Logs l1,
        Logs l2,
        Logs l3
    WHERE
        l1.Id = l2.Id - 1
        AND l2.Id = l3.Id - 1
        AND l1.Num = l2.Num
        AND l2.Num = l3.Num
    ;
    */
    
}
