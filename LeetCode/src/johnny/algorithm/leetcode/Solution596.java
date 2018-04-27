package johnny.algorithm.leetcode;

/**
 *596. Classes More Than 5 Students
 *There is a table courses with columns: student and class

Please list out all classes which have more than or equal to 5 students.

For example, the table:

+---------+------------+
| student | class      |
+---------+------------+
| A       | Math       |
| B       | English    |
| C       | Math       |
| D       | Biology    |
| E       | Math       |
| F       | Computer   |
| G       | Math       |
| H       | Math       |
| I       | Math       |
+---------+------------+
Should output:

+---------+
| class   |
+---------+
| Math    |
+---------+
Note:
The students should not be counted duplicate in each course.


 * @author Johnny
 */
public class Solution596 {
    public int query() {
        return 0;
    }
    //# Write your MySQL query statement below
    
    /*
    Create table If Not Exists courses (student varchar(255), class varchar(255));
    Truncate table courses;
    insert into courses (student, class) values ('A', 'Math');
    insert into courses (student, class) values ('B', 'English');
    insert into courses (student, class) values ('C', 'Math');
    insert into courses (student, class) values ('D', 'Biology');
    insert into courses (student, class) values ('E', 'Math');
    insert into courses (student, class) values ('F', 'Computer');
    insert into courses (student, class) values ('G', 'Math');
    insert into courses (student, class) values ('H', 'Math');
    insert into courses (student, class) values ('I', 'Math');
    */
    
    /*
    SELECT class
    FROM (
        SELECT COUNT(*) cnt, class
        FROM (SELECT DISTINCT * FROM courses) c1
        GROUP BY class
        HAVING cnt >= 5) c2
    */
}
