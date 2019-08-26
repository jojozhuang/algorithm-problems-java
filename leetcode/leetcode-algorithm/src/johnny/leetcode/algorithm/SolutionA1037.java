package johnny.leetcode.algorithm;

/**
 * 1037. Valid Boomerang
A boomerang is a set of 3 points that are all distinct and not in a straight line.

Given a list of three points in the plane, return whether these points are a boomerang.

 

Example 1:

Input: [[1,1],[2,3],[3,2]]
Output: true
Example 2:

Input: [[1,1],[2,2],[3,3]]
Output: false
 

Note:

points.length == 3
points[i].length == 2
0 <= points[i][j] <= 100

 * @author Johnny
 */
public class SolutionA1037 {
    public boolean isBoomerang(int[][] points) {
        int[] point1 = points[0];
        int[] point2 = points[1];
        int[] point3 = points[2];
        int slope1 = 0;
        if (point2[0] - point1[0] == 0) {
            slope1 = Integer.MAX_VALUE;
        }
        int slope2 = 0;
        if (point3[0] - point2[0] == 0) {
            slope2 = Integer.MAX_VALUE;
        }
        
        if (slope1 == Integer.MAX_VALUE && slope2 == Integer.MAX_VALUE) {
            return false;
        }
        
        return (point2[1]-point1[1]) * (point3[0]-point2[0]) != (point2[0]-point1[0]) * (point3[1]-point2[1]);
    }
}
