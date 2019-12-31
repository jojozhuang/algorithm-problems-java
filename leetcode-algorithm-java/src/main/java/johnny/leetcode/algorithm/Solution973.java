package johnny.leetcode.algorithm;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
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
    // partition
    public int[][] kClosest(int[][] points, int K) {
        if (points == null || points.length == 0 || K < 1) {
            return points;
        }
        int start = 0;
        int end = points.length - 1;
        while (start <= end) {
            int pos = partition(points, start, end);
            if (pos == K) {
                break;
            }
            if (pos < K) {
                start = pos + 1;
            } else {
                end = pos - 1;
            }
        }
        
        return Arrays.copyOfRange(points, 0, K);
    }
    
    private int partition(int[][] points, int start, int end) {
        int pivot = start;
        int[] first = points[start];
        int len = first[0]*first[0] + first[1]*first[1];
        for (int i = start + 1; i <= end; i++) {
            int[] curr = points[i];
            int dis = curr[0]*curr[0] + curr[1]*curr[1];
            if (dis < len) {
                pivot++;
                int[] temp = points[pivot];
                points[pivot] = points[i];
                points[i] = temp;
            }
        }
        
        int[] temp = points[pivot];
        points[pivot] = points[start];
        points[start] = temp;
        return pivot;
    }
    // priority queue
    public int[][] kClosest2(int[][] points, int K) {
        if (points == null || points.length == 0 || K < 1) {
            return points;
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->((b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1])));
        for (int[] point : points) {
            pq.offer(point);
            if (pq.size() > K) {
                pq.poll();
            }
        }
        
        int[][] ans = new int[pq.size()][2];
        int i = ans.length - 1;
        while (!pq.isEmpty()) {
            ans[i] = pq.poll();
            i--;
        }
        
        return ans;
    }
    // sort
    public int[][] kClosest3(int[][] points, int K) {
        if (points == null || points.length == 0 || K < 1) {
            return points;
        }
        
        Arrays.sort(points, (a,b)->((a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1])));
        return Arrays.copyOfRange(points, 0, K);
    }
}
