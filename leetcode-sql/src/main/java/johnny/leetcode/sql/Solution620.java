package johnny.leetcode.sql;

/**
 * 620. Not Boring Movies
 * X city opened a new cinema, many people would like to go to this cinema. The cinema also gives out a poster indicating the movies’ ratings and descriptions.
Please write a SQL query to output movies with an odd numbered ID and a description that is not 'boring'. Order the result by rating.

For example, table cinema:

+---------+-----------+--------------+-----------+
|   id    | movie     |  description |  rating   |
+---------+-----------+--------------+-----------+
|   1     | War       |   great 3D   |   8.9     |
|   2     | Science   |   fiction    |   8.5     |
|   3     | irish     |   boring     |   6.2     |
|   4     | Ice song  |   Fantacy    |   8.6     |
|   5     | House card|   Interesting|   9.1     |
+---------+-----------+--------------+-----------+
For the example above, the output should be:
+---------+-----------+--------------+-----------+
|   id    | movie     |  description |  rating   |
+---------+-----------+--------------+-----------+
|   5     | House card|   Interesting|   9.1     |
|   1     | War       |   great 3D   |   8.9     |
+---------+-----------+--------------+-----------+

 * @author Johnny
 */
public class Solution620 {
    public int query() {
        return 0;
    }
    //# Write your MySQL query statement below
    
    /*
    Create table If Not Exists cinema (id int, movie varchar(255), description varchar(255), rating float(2, 1));
    Truncate table cinema;
    insert into cinema (id, movie, description, rating) values ('1', 'War', 'great 3D', '8.9');
    insert into cinema (id, movie, description, rating) values ('2', 'Science', 'fiction', '8.5');
    insert into cinema (id, movie, description, rating) values ('3', 'irish', 'boring', '6.2');
    insert into cinema (id, movie, description, rating) values ('4', 'Ice song', 'Fantacy', '8.6');
    insert into cinema (id, movie, description, rating) values ('5', 'House card', 'Interesting', '9.1');
    */
    
    
}
