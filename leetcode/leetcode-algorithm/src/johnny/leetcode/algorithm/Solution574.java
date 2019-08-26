package johnny.leetcode.algorithm;

/**
 *574. Winning Candidate
 *Table: Candidate

+-----+---------+
| id  | Name    |
+-----+---------+
| 1   | A       |
| 2   | B       |
| 3   | C       |
| 4   | D       |
| 5   | E       |
+-----+---------+  
Table: Vote

+-----+--------------+
| id  | CandidateId  |
+-----+--------------+
| 1   |     2        |
| 2   |     4        |
| 3   |     3        |
| 4   |     2        |
| 5   |     5        |
+-----+--------------+
id is the auto-increment primary key,
CandidateId is the id appeared in Candidate table.
Write a sql to find the name of the winning candidate, the above example will return the winner B.

+------+
| Name |
+------+
| B    |
+------+
Notes:
You may assume there is no tie, in other words there will be at most one winning candidate.
 * @author Johnny
 */
public class Solution574 {
    public int query() {
        return 0;
    }
    //# Write your MySQL query statement below
    /*
    Create table If Not Exists Candidate (id int, Name varchar(255));
    Create table If Not Exists Vote (id int, CandidateId int);
    Truncate table Vote;
    insert into Vote (id, CandidateId) values ('1', '2');
    insert into Vote (id, CandidateId) values ('2', '4');
    insert into Vote (id, CandidateId) values ('3', '3');
    insert into Vote (id, CandidateId) values ('4', '2');
    insert into Vote (id, CandidateId) values ('5', '5');
    Truncate table Candidate;
    insert into Candidate (id, Name) values ('1', 'A');
    insert into Candidate (id, Name) values ('2', 'B');
    insert into Candidate (id, Name) values ('3', 'C');
    insert into Candidate (id, Name) values ('4', 'D');
    insert into Candidate (id, Name) values ('5', 'E');
    */
    
    /*
    SELECT Candidate.Name
    FROM Candidate,
        (SELECT COUNT(*) cnt, CandidateId 
         FROM Vote
         GROUP BY CandidateId
         ORDER BY cnt DESC LIMIT 1) v
    WHERE Candidate.Id = v.CandidateId
    */
}
