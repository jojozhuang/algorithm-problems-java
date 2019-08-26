package johnny.leetcode.algorithm;

/**
 *601. Human Traffic of Stadium
 *X city built a new stadium, each day many people visit it and the stats are saved as these columns: id, date, people

Please write a query to display the records which have 3 or more consecutive rows and the amount of people more than 100(inclusive).

For example, the table stadium:
+------+------------+-----------+
| id   | date       | people    |
+------+------------+-----------+
| 1    | 2017-01-01 | 10        |
| 2    | 2017-01-02 | 109       |
| 3    | 2017-01-03 | 150       |
| 4    | 2017-01-04 | 99        |
| 5    | 2017-01-05 | 145       |
| 6    | 2017-01-06 | 1455      |
| 7    | 2017-01-07 | 199       |
| 8    | 2017-01-08 | 188       |
+------+------------+-----------+
For the sample data above, the output is:

+------+------------+-----------+
| id   | date       | people    |
+------+------------+-----------+
| 5    | 2017-01-05 | 145       |
| 6    | 2017-01-06 | 1455      |
| 7    | 2017-01-07 | 199       |
| 8    | 2017-01-08 | 188       |
+------+------------+-----------+
Note:
Each day only have one row record, and the dates are increasing with id increasing.
 * @author Johnny
 */
public class Solution601 {
    public int query() {
        return 0;
    }
    //# Write your MySQL query statement below
    /*
    Create table If Not Exists stadium (id int, date DATE NULL, people int);
    Truncate table stadium;
    insert into stadium (id, date, people) values ('1', '2017-01-01', '10');
    insert into stadium (id, date, people) values ('2', '2017-01-02', '109');
    insert into stadium (id, date, people) values ('3', '2017-01-03', '150');
    insert into stadium (id, date, people) values ('4', '2017-01-04', '99');
    insert into stadium (id, date, people) values ('5', '2017-01-05', '145');
    insert into stadium (id, date, people) values ('6', '2017-01-06', '1455');
    insert into stadium (id, date, people) values ('7', '2017-01-07', '199');
    insert into stadium (id, date, people) values ('8', '2017-01-08', '188');
    */
    
    /*
    select distinct t1.*
    from stadium t1, stadium t2, stadium t3
    where t1.people >= 100 and t2.people >= 100 and t3.people >= 100
    and
    (
          (t1.id - t2.id = 1 and t1.id - t3.id = 2 and t2.id - t3.id =1)  -- t1, t2, t3
        or
        (t2.id - t1.id = 1 and t2.id - t3.id = 2 and t1.id - t3.id =1) -- t2, t1, t3
        or
        (t3.id - t2.id = 1 and t2.id - t1.id =1 and t3.id - t1.id = 2) -- t3, t2, t1
    )
    order by t1.id
    ;
    */
}
