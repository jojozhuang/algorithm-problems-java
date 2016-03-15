/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;
import leetcode.common.Point;

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
        
        if (points.length == 1) {
            return 1;
        }
        
        HashMap<Float, Integer> map = new HashMap<>();
        int max = 0;
        
        for(int i = 0; i < points.length; i++) {
            map.clear();
            int duplicated = 1;
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                if (points[i].x == points[j].x && points[i].y == points[j].y) {
                    duplicated++;
                    continue;
                }
                float slope = 0;
                if (points[i].x == points[j].x) {
                    slope = Float.MAX_VALUE;
                } else {
                    slope = (float)(points[i].y - points[j].y) / (points[i].x - points[j].x);
                }
                if (!map.containsKey(slope)) {
                    map.put(slope, 1);
                } else {
                    map.put(slope, map.get(slope) + 1);
                }
            }
            for (Integer count : map.values()) {
                if (count + duplicated > max) {
                    max = count + duplicated;
                }
            }
            max = Math.max(max, duplicated);
        }
        
        return max;
    }
}
