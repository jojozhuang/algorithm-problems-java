package johnny.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Line Reflection.
 * 
 * Given n points on a 2D plane, find if there is such a line parallel to 
 * y-axis that reflect the given set of points.
 * 
 * Example 1:
 * Given points = [[1,1],[-1,1]], return true.
 * 
 * Example 2:
 * Given points = [[1,1],[-1,-1]], return false.
 * 
 * Follow up:
 * Could you do better than O(n2)?
 * 
 * Hint:
 * 
 * Find the smallest and largest x-value for all points.
 * If there is a line then it should be at y = (minX + maxX) / 2.
 * For each point, make sure that it has a reflected point in the opposite side.
 * 
 * @author Johnny
 */
public class Solution356 {
    public boolean isReflected(int[][] points) {
        if (points == null || points.length == 0 || points[0].length == 0) {
            return true;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashSet<String> set = new HashSet<>();
        for(int[] p:points){
            max = Math.max(max,p[0]);
            min = Math.min(min,p[0]);
            String str = p[0] + "a" + p[1];
            set.add(str);
        }
        int sum = max+min;
        for(int[] p:points){
            //int[] arr = {sum-p[0],p[1]};
            String str = (sum-p[0]) + "a" + p[1];
            if( !set.contains(str))
                return false;
            
        }
        return true;
    }
    //http://www.cnblogs.com/grandyang/p/5579271.html
    //https://segmentfault.com/a/1190000005825171
    public boolean isReflected3(int[][] points) {
        if (points == null || points.length == 0 || points[0].length == 0) {
            return false;
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < points.length; i++) {
            min = Math.min(min, points[i][0]);
            max = Math.max(max, points[i][0]);
        }
        
        double mid = min + (double)(max - min) / 2;
        for (int i = 0; i < points.length / 2; i++) {
            boolean found = false;
            double second = 2 * mid - points[i][0];
            for (int j = i + 1; j < points.length; j++) {
                if (points[i][1] == points[j][1] && points[j][0] == second) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
    public boolean isReflected2(int[][] points) {
        if (points == null || points.length == 0 || points[0].length == 0) {
            return false;
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        Set<String> set = new HashSet<String>();
        for (int[] p : points) {
            set.add(p[0] + "," + p[1]);
            min = Math.min(min, p[0]);
            max = Math.max(max, p[0]);
        }
        
        int sum = min + max;
        for (int[] p : points) {
            if (!set.contains((sum - p[0]) + "," + p[1])) {
                return false;
            }
        }
        return true;
    }
}
