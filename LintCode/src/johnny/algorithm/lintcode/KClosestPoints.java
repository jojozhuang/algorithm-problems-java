/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode;

import java.util.Arrays;
import java.util.Comparator;

import johnny.algorithm.lintcode.common.Point;

/**
 * K Closest Points
 * Given some points and a point origin in two dimensional space, find k points 
 * out of the some points which are nearest to origin.
 * Return these points sorted by distance, if they are same with distance, 
 * sorted by x-axis, otherwise sorted by y-axis.
 * 
 * Given points = [[4,6],[4,7],[4,4],[2,5],[1,1]], origin = [0, 0], k = 3
 * return [[1,1],[2,5],[4,4]]
 * 
 * @author Johnny
 */
public class KClosestPoints {
    /**
     * @param points a list of points
     * @param origin a point
     * @param k an integer
     * @return the k closest points
     */
    public Point[] kClosest(final Point[] points, Point origin, int k) {
        if (points == null || points.length == 0 || origin == null || k <= 0) {
            return new Point[0];
        }
        
        Integer[] index = new Integer[points.length];
        for(int i = 0; i < points.length; i++) {
            index[i] = i;
        }
        
        final Double[] distance = new Double[points.length];
        for (int i = 0; i < points.length; i++) {
            distance[i] = Math.sqrt(Math.pow(points[i].x - origin.x, 2) + Math.pow(points[i].y - origin.y, 2));
        }
        
        Comparator cmp = new Comparator<Integer>() {
            public int compare(Integer d1, Integer d2) {
                if (Double.compare(distance[d1], distance[d2]) == 0) {
                    return (points[d1].x - points[d2].x);
                } else {
                    return Double.compare(distance[d1], distance[d2]);
                }
            }
        };
        Arrays.sort(index, cmp);
        
        Point[] res = new Point[Math.min(k, points.length)];
        for (int i = 0; i < res.length; i++) {
            res[i] = points[index[i]];
        }
        
        return res;
    }
}
