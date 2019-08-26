package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  963. Minimum Area Rectangle II
Given a set of points in the xy-plane, determine the minimum area of any rectangle formed from these points, with sides not necessarily parallel to the x and y axes.

If there isn't any rectangle, return 0.

 

Example 1:



Input: [[1,2],[2,1],[1,0],[0,1]]
Output: 2.00000
Explanation: The minimum area rectangle occurs at [1,2],[2,1],[1,0],[0,1], with an area of 2.
Example 2:



Input: [[0,1],[2,1],[1,1],[1,0],[2,0]]
Output: 1.00000
Explanation: The minimum area rectangle occurs at [1,0],[1,1],[2,1],[2,0], with an area of 1.
Example 3:



Input: [[0,3],[1,2],[3,1],[1,3],[2,1]]
Output: 0
Explanation: There is no possible rectangle to form from these points.
Example 4:



Input: [[3,1],[1,1],[0,1],[2,1],[3,3],[3,2],[0,2],[2,3]]
Output: 2.00000
Explanation: The minimum area rectangle occurs at [2,1],[2,3],[3,3],[3,1], with an area of 2.
 

Note:

1 <= points.length <= 50
0 <= points[i][0] <= 40000
0 <= points[i][1] <= 40000
All points are distinct.
Answers within 10^-5 of the actual value will be accepted as correct.

 * @author Johnny
 */
public class Solution963 {
    public double minAreaFreeRect(int[][] points) { //copy
        int len = points.length;
        double res = Double.MAX_VALUE;
        if (len < 4) return 0.0;
        Map<String, List<int[]>> map = new HashMap<>(); // int[] is the index of two points forming the diagonal
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                long dis = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0]) + (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
                double centerX = (double)(points[j][0] + points[i][0])/2; // centerX and centerY is the coordinate of the diagonal center
                double centerY = (double)(points[j][1] + points[i][1])/2;
                String key = "" + dis + "+" + centerX + "+" + centerY; // key includes the length of the diagonal and the coordinate of the diagonal center
                if (map.get(key) == null) map.put(key, new ArrayList<int[]>());
                map.get(key).add(new int[]{i,j});
            }
        }
        for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {  
                List<int[]> list = map.get(key);
                for (int i = 0; i < list.size(); i++) { // there could be multiple rectangles inside
                    for (int j = i + 1; j < list.size(); j++) {
                        int p1 = list.get(i)[0]; // p1, p2 and p3 are the three vertices of a rectangle
                        int p2 = list.get(j)[0];
                        int p3 = list.get(j)[1];
                        // len1 and len2 are the length of the sides of a rectangle
                        double len1 = Math.sqrt((points[p1][0] - points[p2][0]) * (points[p1][0] - points[p2][0]) +  (points[p1][1] - points[p2][1]) * (points[p1][1] - points[p2][1])); 
                        double len2 = Math.sqrt((points[p1][0] - points[p3][0]) * (points[p1][0] - points[p3][0]) +  (points[p1][1] - points[p3][1]) * (points[p1][1] - points[p3][1]));
                        double area = len1 * len2; 
                        res = Math.min(res, area);
                    }
                }
            }
        }
        return res == Double.MAX_VALUE ?  0.0 : res;
    }
}
