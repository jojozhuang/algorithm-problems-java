package johnny.leetcode.sql;

/**
 * 175. Combine Two Tables
 * Table: Person

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| PersonId    | int     |
| FirstName   | varchar |
| LastName    | varchar |
+-------------+---------+
PersonId is the primary key column for this table.
Table: Address

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| AddressId   | int     |
| PersonId    | int     |
| City        | varchar |
| State       | varchar |
+-------------+---------+
AddressId is the primary key column for this table.
 

Write a SQL query for a report that provides the following information for each person in the Person table, regardless if there is an address for each of those people:

 

FirstName, LastName, City, State

 * @author Johnny
 */
public class Solution175 {
    public int query() {
        return 0;
    }
    /*
    Create table Person (PersonId int, FirstName varchar(255), LastName varchar(255));
    Create table Address (AddressId int, PersonId int, City varchar(255), State varchar(255));
    Truncate table Person;
    insert into Person (PersonId, LastName, FirstName) values ('1', 'Wang', 'Allen'), (2,'Rong','Zhuang');
    Truncate table Address;
    insert into Address (AddressId, PersonId, City, State) values ('1', '2', 'New York City', 'New York');
     */
    
    /*
    SELECT person.FirstName, person.LastName, address.City, address.State
    FROM Person AS person
    LEFT JOIN Address AS address ON person.PersonId = address.PersonId
     */
}
