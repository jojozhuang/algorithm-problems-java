package johnny.leetcode.algorithm;

/**
 *569. Median Employee Salary
 *The Employee table holds all employees. The employee table has three columns: Employee Id, Company Name, and Salary.

+-----+------------+--------+
|Id   | Company    | Salary |
+-----+------------+--------+
|1    | A          | 2341   |
|2    | A          | 341    |
|3    | A          | 15     |
|4    | A          | 15314  |
|5    | A          | 451    |
|6    | A          | 513    |
|7    | B          | 15     |
|8    | B          | 13     |
|9    | B          | 1154   |
|10   | B          | 1345   |
|11   | B          | 1221   |
|12   | B          | 234    |
|13   | C          | 2345   |
|14   | C          | 2645   |
|15   | C          | 2645   |
|16   | C          | 2652   |
|17   | C          | 65     |
+-----+------------+--------+
Write a SQL query to find the median salary of each company. Bonus points if you can solve it without using any built-in SQL functions.

+-----+------------+--------+
|Id   | Company    | Salary |
+-----+------------+--------+
|5    | A          | 451    |
|6    | A          | 513    |
|12   | B          | 234    |
|9    | B          | 1154   |
|14   | C          | 2645   |
+-----+------------+--------+
 * @author Johnny
 */
public class Solution569 {
    public int query() {
        return 0;
    }
    //# Write your MySQL query statement below
    
    /*
    Create table If Not Exists Employee (Id int, Company varchar(255), Salary int);
    Truncate table Employee;
    insert into Employee (Id, Company, Salary) values ('1', 'A', '2341');
    insert into Employee (Id, Company, Salary) values ('2', 'A', '341');
    insert into Employee (Id, Company, Salary) values ('3', 'A', '15');
    insert into Employee (Id, Company, Salary) values ('4', 'A', '15314');
    insert into Employee (Id, Company, Salary) values ('5', 'A', '451');
    insert into Employee (Id, Company, Salary) values ('6', 'A', '513');
    insert into Employee (Id, Company, Salary) values ('7', 'B', '15');
    insert into Employee (Id, Company, Salary) values ('8', 'B', '13');
    insert into Employee (Id, Company, Salary) values ('9', 'B', '1154');
    insert into Employee (Id, Company, Salary) values ('10', 'B', '1345');
    insert into Employee (Id, Company, Salary) values ('11', 'B', '1221');
    insert into Employee (Id, Company, Salary) values ('12', 'B', '234');
    insert into Employee (Id, Company, Salary) values ('13', 'C', '2345');
    insert into Employee (Id, Company, Salary) values ('14', 'C', '2645');
    insert into Employee (Id, Company, Salary) values ('15', 'C', '2645');
    insert into Employee (Id, Company, Salary) values ('16', 'C', '2652');
    insert into Employee (Id, Company, Salary) values ('17', 'C', '65');
    */
    
    /*
    SELECT
        ANY_VALUE(Employee.Id), Employee.Company, Employee.Salary
    FROM
        Employee,
        Employee alias
    WHERE
        Employee.Company = alias.Company
    GROUP BY Employee.Company , Employee.Salary
    HAVING SUM(CASE
        WHEN Employee.Salary = alias.Salary THEN 1
        ELSE 0
    END) >= ABS(SUM(SIGN(Employee.Salary - alias.Salary)))
    ORDER BY ANY_VALUE(Employee.Id)
    */
}
