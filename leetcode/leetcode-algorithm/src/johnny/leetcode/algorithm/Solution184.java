package johnny.leetcode.algorithm;

/**
 * 184. Department Highest Salary
 *The Employee table holds all employees. Every employee has an Id, a salary, and there is also a column for the department Id.

+----+-------+--------+--------------+
| Id | Name  | Salary | DepartmentId |
+----+-------+--------+--------------+
| 1  | Joe   | 70000  | 1            |
| 2  | Henry | 80000  | 2            |
| 3  | Sam   | 60000  | 2            |
| 4  | Max   | 90000  | 1            |
+----+-------+--------+--------------+
The Department table holds all departments of the company.

+----+----------+
| Id | Name     |
+----+----------+
| 1  | IT       |
| 2  | Sales    |
+----+----------+
Write a SQL query to find employees who have the highest salary in each of the departments. For the above tables, Max has the highest salary in the IT department and Henry has the highest salary in the Sales department.

+------------+----------+--------+
| Department | Employee | Salary |
+------------+----------+--------+
| IT         | Max      | 90000  |
| Sales      | Henry    | 80000  |
+------------+----------+--------+
 * @author Johnny
 */
public class Solution184 {
    public int query() {
        return 0;
    }
    /*
    USE `leetcode3`;
    Create table If Not Exists Employee (Id int, Name varchar(255), Salary int, DepartmentId int);
    Create table If Not Exists Department (Id int, Name varchar(255));
    Truncate table Employee;
    insert into Employee (Id, Name, Salary, DepartmentId) values ('1', 'Joe', '70000', '1');
    insert into Employee (Id, Name, Salary, DepartmentId) values ('2', 'Henry', '80000', '2');
    insert into Employee (Id, Name, Salary, DepartmentId) values ('3', 'Sam', '60000', '2');
    insert into Employee (Id, Name, Salary, DepartmentId) values ('4', 'Max', '90000', '1');
    Truncate table Department;
    insert into Department (Id, Name) values ('1', 'IT');
    insert into Department (Id, Name) values ('2', 'Sales');
    */
    
    /*
    SELECT d.Name AS Department, e.Name AS Employee, e.Salary
    FROM Employee e
    JOIN Department d ON e.DepartmentId = d.Id
    JOIN (SELECT Max(Salary) MaxSalary, DepartmentId
    FROM Employee
    GROUP BY DepartmentId) m ON e.Salary=m.MaxSalary and e.DepartmentId = m.DepartmentId
    */
}
