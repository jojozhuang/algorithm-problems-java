package johnny.algorithm.leetcode;

import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * 973. K Closest Points to Origin
We have a list of points on the plane.  Find the K closest points to the origin (0, 0).

(Here, the distance between two points on a plane is the Euclidean distance.)

You may return the answer in any order.  The answer is guaranteed to be unique (except for the order that it is in.)

 

Example 1:

Input: points = [[1,3],[-2,2]], K = 1
Output: [[-2,2]]
Explanation: 
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest K = 1 points from the origin, so the answer is just [[-2,2]].
Example 2:

Input: points = [[3,3],[5,-1],[-2,4]], K = 2
Output: [[3,3],[-2,4]]
(The answer [[-2,4],[3,3]] would also be accepted.)
 

Note:

1 <= K <= points.length <= 10000
-10000 < points[i][0] < 10000
-10000 < points[i][1] < 10000

 * @author Johnny
 */
public class Solution973 {
    public int[][] kClosest(int[][] points, int K) {
        if (points == null || points.length == 0 || K < 1) {
            return null;
        }
        
        TreeMap<Double, int[]> map = new TreeMap<>();
        for (int i = 0; i < points.length; i++) {
            double distance = Math.sqrt(points[i][0]*points[i][0] + points[i][1]*points[i][1]);
            map.put(distance, points[i]);
        }
        
        if (K > points.length) {
            K = points.length;
        }
        int[][] res = new int[K][2];
        int i = 0;
        for (Entry<Double, int[]> entry : map.entrySet()) {
            if (i < K) {
                res[i] = entry.getValue();
                i++;
            } else {
                break;
            }
         }
        
        return res;
    }
}
