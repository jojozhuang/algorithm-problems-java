package johnny.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 961. N-Repeated Element in Size 2N Array
In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.

Return the element repeated N times.

 

Example 1:

Input: [1,2,3,3]
Output: 3
Example 2:

Input: [2,1,2,5,3,2]
Output: 2
Example 3:

Input: [5,1,5,2,5,3,5,4]
Output: 5
 

Note:

4 <= A.length <= 10000
0 <= A[i] < 10000
A.length is even

 * @author Johnny
 */
public class Solution961 {
    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(A[i])) {
                map.put(A[i], 0);
            }
            map.put(A[i], map.get(A[i]) + 1);
            if (map.get(A[i]) >= n / 2) {
                return A[i];
            }
        }
        
        return -1;
    }
}
