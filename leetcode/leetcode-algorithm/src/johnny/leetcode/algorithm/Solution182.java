package johnny.leetcode.algorithm;

/**
 * 182. Duplicate Emails
 *Write a SQL query to find all duplicate emails in a table named Person.

+----+---------+
| Id | Email   |
+----+---------+
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |
+----+---------+
For example, your query should return the following for the above table:

+---------+
| Email   |
+---------+
| a@b.com |
+---------+
Note: All emails are in lowercase.
 * @author Johnny
 */
public class Solution182 {
    public int query() {
        return 0;
    }
    /*
    USE `leetcode2`;
    Create table If Not Exists Person (Id int, Email varchar(255));
    Truncate table Person;
    insert into Person (Id, Email) values ('1', 'a@b.com');
    insert into Person (Id, Email) values ('2', 'c@d.com');
    insert into Person (Id, Email) values ('3', 'a@b.com');
    */
    
    /*
    SELECT Email
    FROM Person
    GROUP BY Email
    HAVING COUNT(Email) > 1
    */
}
