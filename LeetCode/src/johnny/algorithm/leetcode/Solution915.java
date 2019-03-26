package johnny.algorithm.leetcode;

/**
 * 915. Partition Array into Disjoint Intervals

Given an array A, partition it into two (contiguous) subarrays left and right so that:

Every element in left is less than or equal to every element in right.
left and right are non-empty.
left has the smallest possible size.
Return the length of left after such a partitioning.  It is guaranteed that such a partitioning exists.

 

Example 1:

Input: [5,0,3,8,6]
Output: 3
Explanation: left = [5,0,3], right = [8,6]
Example 2:

Input: [1,1,1,0,6,12]
Output: 4
Explanation: left = [1,1,1,0], right = [6,12]
 

Note:

2 <= A.length <= 30000
0 <= A[i] <= 10^6
It is guaranteed there is at least one way to partition A as described.

 * @author Johnny
 */
public class Solution915 {
    public int partitionDisjoint(int[] A) {
        int n = A.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, A[i]);
            left[i] = max;
        }
        int min = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            min = Math.min(min, A[i]);
            right[i] = min;
        }
        
        for (int i = 1; i < n; i++) {
            if (left[i - 1] <= right[i]) {
                return i;
            }
        }
        
        return -1;
    }
}
