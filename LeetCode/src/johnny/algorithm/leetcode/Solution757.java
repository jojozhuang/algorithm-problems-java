package johnny.algorithm.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 *757. Set Intersection Size At Least Two
 *An integer interval [a, b] (for integers a < b) is a set of all consecutive integers from a to b, 
 *including a and b.

Find the minimum size of a set S such that for every integer interval A in intervals, the intersection
 of S with A has size at least 2.

Example 1:
Input: intervals = [[1, 3], [1, 4], [2, 5], [3, 5]]
Output: 3
Explanation:
Consider the set S = {2, 3, 4}.  For each interval, there are at least 2 elements from S in the 
interval.
Also, there isn't a smaller size set that fulfills the above condition.
Thus, we output the size of this set, which is 3.
Example 2:
Input: intervals = [[1, 2], [2, 3], [2, 4], [4, 5]]
Output: 5
Explanation:
An example of a minimum sized set is {1, 2, 3, 4, 5}.
Note:

intervals will have length in range [1, 3000].
intervals[i] will have length 2, representing some integer interval.
intervals[i][j] will be an integer in [0, 10^8].

 * @author Johnny
 */
public class Solution757 {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[1] != b[1] ? Integer.compare(a[1], b[1]) : Integer.compare(b[0], a[0]);
            }
        });
        
        int res = 0, largest = -1, second = -1;
        
        for (int[] interval : intervals) {
            int a = interval[0];
            int b = interval[1];
        
            boolean is_largest_in = (a <= largest);
            boolean is_second_in = (a <= second);
            
            if (is_largest_in && is_second_in) {
                continue;
            }

            res += (is_largest_in ? 1 : 2);
            second = (is_largest_in ? largest : b - 1);
            largest = b;
        }
        
        return res;
    }
}
