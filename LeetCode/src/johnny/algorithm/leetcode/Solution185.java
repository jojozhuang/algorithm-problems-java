package johnny.algorithm.leetcode;

/**
 * 185. Department Top Three Salaries
 *The Employee table holds all employees. Every employee has an Id, and there is also a column for the department Id.

+----+-------+--------+--------------+
| Id | Name  | Salary | DepartmentId |
+----+-------+--------+--------------+
| 1  | Joe   | 70000  | 1            |
| 2  | Henry | 80000  | 2            |
| 3  | Sam   | 60000  | 2            |
| 4  | Max   | 90000  | 1            |
| 5  | Janet | 69000  | 1            |
| 6  | Randy | 85000  | 1            |
+----+-------+--------+--------------+
The Department table holds all departments of the company.

+----+----------+
| Id | Name     |
+----+----------+
| 1  | IT       |
| 2  | Sales    |
+----+----------+
Write a SQL query to find employees who earn the top three salaries in each of the department. For the above tables, your SQL query should return the following rows.

+------------+----------+--------+
| Department | Employee | Salary |
+------------+----------+--------+
| IT         | Max      | 90000  |
| IT         | Randy    | 85000  |
| IT         | Joe      | 70000  |
| Sales      | Henry    | 80000  |
| Sales      | Sam      | 60000  |
+------------+----------+--------+
 * @author Johnny
 */
public class Solution185 {
    public int query() {
        return 0;
    }
    /*
    USE `leetcode4`;
    Create table If Not Exists Employee (Id int, Name varchar(255), Salary int, DepartmentId int);
    Create table If Not Exists Department (Id int, Name varchar(255));
    Truncate table Employee;
    insert into Employee (Id, Name, Salary, DepartmentId) values ('1', 'Joe', '70000', '1');
    insert into Employee (Id, Name, Salary, DepartmentId) values ('2', 'Henry', '80000', '2');
    insert into Employee (Id, Name, Salary, DepartmentId) values ('3', 'Sam', '60000', '2');
    insert into Employee (Id, Name, Salary, DepartmentId) values ('4', 'Max', '90000', '1');
    insert into Employee (Id, Name, Salary, DepartmentId) values ('5', 'Janet', '69000', '1');
    insert into Employee (Id, Name, Salary, DepartmentId) values ('6', 'Randy', '85000', '1');
    Truncate table Department;
    insert into Department (Id, Name) values ('1', 'IT');
    insert into Department (Id, Name) values ('2', 'Sales');
    */
    
    /*
    SELECT
        d.Name AS 'Department', e1.Name AS 'Employee', e1.Salary
    FROM
        Employee e1
            JOIN
        Department d ON e1.DepartmentId = d.Id
    WHERE
        3 > (SELECT
                COUNT(DISTINCT e2.Salary)
            FROM
                Employee e2
            WHERE
                e2.Salary > e1.Salary
                    AND e1.DepartmentId = e2.DepartmentId
            );
    */

}
