package johnny.algorithm.leetcode;

/**
 * 618. Students Report By Geography
 * A U.S graduate school has students from Asia, Europe and America. The students' location information are stored in table student as below.
| name   | continent |
|--------|-----------|
| Jack   | America   |
| Pascal | Europe    |
| Xi     | Asia      |
| Jane   | America   |
Pivot the continent column in this table so that each name is sorted alphabetically and displayed underneath its corresponding continent. The output headers should be America, Asia and Europe respectively. It is guaranteed that the student number from America is no less than either Asia or Europe.
For the sample input, the output is:
| America | Asia | Europe |
|---------|------|--------|
| Jack    | Xi   | Pascal |
| Jane    |      |        |
Follow-up: If it is unknown which continent has the most students, can you write a query to generate the student report?
 * @author Johnny
 */
public class Solution618 {
    public int query() {
        return 0;
    }
    //# Write your MySQL query statement below
    
    /*
    Create table If Not Exists student (name varchar(50), continent varchar(7));
    Truncate table student;
    insert into student (name, continent) values ('Jane', 'America');
    insert into student (name, continent) values ('Pascal', 'Europe');
    insert into student (name, continent) values ('Xi', 'Asia');
    insert into student (name, continent) values ('Jack', 'America');
    */
    
    /*
    SELECT 
        America, Asia, Europe
    FROM
        (SELECT @as:=0, @am:=0, @eu:=0) t,
        (SELECT 
            @as:=@as + 1 AS asid, name AS Asia
        FROM
            student
        WHERE
            continent = 'Asia'
        ORDER BY Asia) AS t1
            RIGHT JOIN
        (SELECT 
            @am:=@am + 1 AS amid, name AS America
        FROM
            student
        WHERE
            continent = 'America'
        ORDER BY America) AS t2 ON asid = amid
            LEFT JOIN
        (SELECT 
            @eu:=@eu + 1 AS euid, name AS Europe
        FROM
            student
        WHERE
            continent = 'Europe'
        ORDER BY Europe) AS t3 ON amid = euid
    */
}
