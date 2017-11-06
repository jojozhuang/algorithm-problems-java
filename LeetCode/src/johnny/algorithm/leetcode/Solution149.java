/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.HashMap;
import johnny.algorithm.leetcode.common.Point;

/**
 * Max Points on a Line.
 * Given n points on a 2D plane, find the maximum number of points that lie 
 * on the same straight line.
 * 
 * @author Johnny
 */
public class Solution149 {
    //http://fisherlei.blogspot.com/2013/12/leetcode-max-points-on-line-solution.html
    public int maxPoints(Point[] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        
        int max = 0;
        
        for(int i = 0; i < points.length; i++) {
            int duplicated = 1;
            HashMap<Double, Integer> map = new HashMap<>();
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].x == points[j].x && points[i].y == points[j].y) {
                    duplicated++;
                    continue;
                }
                double slope = 0;
                if (points[i].x == points[j].x) {
                    slope = Integer.MAX_VALUE;
                } else {
                    slope = (double)(points[i].y - points[j].y) / (points[i].x - points[j].x) + 0.0;
                }
                if (!map.containsKey(slope)) {
                    map.put(slope, 1);
                } else {
                    map.put(slope, map.get(slope) + 1);
                }
            }
            int localMax = 0;
            for (Integer count : map.values()) {
                localMax = Math.max(localMax, count);
            }
            localMax += duplicated;
            max = Math.max(max, localMax);
        }
        
        return max;
    }
}
