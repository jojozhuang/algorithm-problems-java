package johnny.algorithm.leetcode;

/**
 * 849. Maximize Distance to Closest Person
 * 
 * In a row of seats, 1 represents a person sitting in that seat, and 0 represents that the seat is empty. 

There is at least one empty seat, and at least one person sitting.

Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized. 

Return that maximum distance to closest person.

Example 1:

Input: [1,0,0,0,1,0,1]
Output: 2
Explanation: 
If Alex sits in the second open seat (seats[2]), then the closest person has distance 2.
If Alex sits in any other open seat, the closest person has distance 1.
Thus, the maximum distance to the closest person is 2.
Example 2:

Input: [1,0,0,0]
Output: 3
Explanation: 
If Alex sits in the last seat, the closest person is 3 seats away.
This is the maximum distance possible, so the answer is 3.
Note:

1 <= seats.length <= 20000
seats contains only 0s or 1s, at least one 0, and at least one 1.
 * @author Johnny
 */
public class Solution849 {
    public int maxDistToClosest(int[] seats) {
        if (seats == null || seats.length < 2) {
            return 0;
        }
        
        int max = 0; //maximum number of zeros
        // leading zeros
        int firstOne = 0;
        if (seats[0] == 0) {
            for (int i = 0; i < seats.length; i++) {
                if (seats[i] == 0) {
                    max = Math.max(max, i + 1);
                } else {
                    firstOne = i;
                    break;
                }
            }
        }
        // rear zeros
        int lastOne = seats.length - 1;
        if (seats[seats.length - 1] == 0) {
            for (int i = seats.length - 1; i >= 0; i--) {
                if (seats[i] == 0) {
                    max = Math.max(max, seats.length - i);
                } else {
                    lastOne = i;
                    break;
                }
            }
        }

        int start = -1;
        int count = 0;
        for (int i = firstOne; i <= lastOne; i++) {
            if (seats[i] == 0) {
                if (start == -1) {
                    start = i;
                }
            } else {
                if (start != -1) {
                    count = i - start;
                    max = Math.max(max, (count + 1)/2);
                    start = -1;
                }
            }
        }
        
        return max;
    }
}
