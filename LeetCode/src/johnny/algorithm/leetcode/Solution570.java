package johnny.algorithm.leetcode;

/**
 *570. Managers with at Least 5 Direct Reports
 *The Employee table holds all employees including their managers. Every employee has an Id, and there is also a column for the manager Id.

+------+----------+-----------+----------+
|Id    |Name      |Department |ManagerId |
+------+----------+-----------+----------+
|101   |John      |A          |null      |
|102   |Dan       |A          |101       |
|103   |James     |A          |101       |
|104   |Amy       |A          |101       |
|105   |Anne      |A          |101       |
|106   |Ron       |B          |101       |
+------+----------+-----------+----------+
Given the Employee table, write a SQL query that finds out managers with at least 5 direct report. For the above table, your SQL query should return:

+-------+
| Name  |
+-------+
| John  |
+-------+
Note:
No one would report to himself.
 * @author Johnny
 */
public class Solution570 {
    public int query() {
        return 0;
    }
    //# Write your MySQL query statement below
    
    /*
    Create table If Not Exists Employee (Id int, Name varchar(255), Department varchar(255), ManagerId int);
    Truncate table Employee;
    insert into Employee (Id, Name, Department, ManagerId) values ('101', 'John', 'A', NULL);
    insert into Employee (Id, Name, Department, ManagerId) values ('102', 'Dan', 'A', '101');
    insert into Employee (Id, Name, Department, ManagerId) values ('103', 'James', 'A', '101');
    insert into Employee (Id, Name, Department, ManagerId) values ('104', 'Amy', 'A', '101');
    insert into Employee (Id, Name, Department, ManagerId) values ('105', 'Anne', 'A', '101');
    insert into Employee (Id, Name, Department, ManagerId) values ('106', 'Ron', 'B', '101');
    */
    
    /*
    SELECT e3.Name
    FROM Employee e3, 
        (SELECT count(*) cnt, e1.ManagerId
         FROM Employee e1, Employee e2
         WHERE e1.ManagerId = e2.Id
         GROUP BY ManagerId) m
    WHERE e3.Id = m.ManagerId
    AND m.cnt >= 5
    */

}
