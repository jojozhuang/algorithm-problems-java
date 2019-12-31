package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Number of Boomerangs
 * 
 * Given n points in the plane that are all pairwise distinct, a "boomerang" is 
 * a tuple of points (i, j, k) such that the distance between i and j equals 
 * the distance between i and k (the order of the tuple matters).
 * 
 * Find the number of boomerangs. You may assume that n will be at most 500 
 * and coordinates of points are all in the range [-10000, 10000] (inclusive).
 * 
 * Example:
 * Input:
 * [[0,0],[1,0],[2,0]]
 * 
 * Output:
 * 2
 * 
 * Explanation:
 * The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 * 
 * @author Johnny
 */
public class Solution447 {
    public int numberOfBoomerangs(int[][] points) {
        if (points == null || points.length == 0 || points[0].length == 0) {
            return 0;
        }
        
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] p1 : points) {
            for (int[] p2 : points) {
                if (p1 == p2) {
                    continue;
                }
                
                int d = distance(p1, p2);
                if (!map.containsKey(d)) {
                    map.put(d, 0);
                }
                map.put(d, map.get(d) + 1);
            }
            
            for (int count : map.values()) {
                ans += count * (count - 1);
            }
            map.clear();
        }

        return ans;
    }
    
    private int distance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return dx * dx + dy * dy;
    }
}
