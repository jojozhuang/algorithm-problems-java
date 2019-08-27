package johnny.lintcode.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Building Outline.
 * Given N buildings in a x-axis，each building is a rectangle and can be 
 * represented by a triple (start, end, height)，where start is the start 
 * position on x-axis, end is the end position on x-axis and height is the 
 * height of the building. Buildings may overlap if you see them from far away,
 * find the outline of them.
 * 
 * An outline can be represented by a triple, (start, end, height), where 
 * start is the start position on x-axis of the outline, end is the end position
 * on x-axis and height is the height of the outline.
 * 
 * Given 3 buildings：
 * 
 * [
 *   [1, 3, 3],
 *   [2, 4, 4],
 *   [5, 6, 1]
 * ]
 * The outlines are：
 * 
 * [
 *   [1, 2, 3],
 *   [2, 4, 4],
 *   [5, 6, 1]
 * ]
 *  
 * @author Johnny
 */
public class BuildingOutline {
    public ArrayList<ArrayList<Integer>> buildingOutline(int[][] buildings) {
        // write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (buildings == null || buildings.length == 0 || buildings[0].length == 0) {
            return res;
        }
        
        List<Point> points = new ArrayList<Point>();
        for (int i = 0; i < buildings.length; i++) {
            points.add(new Point(buildings[i][0], -buildings[i][2]));
            points.add(new Point(buildings[i][1], buildings[i][2]));
        }
        Collections.sort(points, new PointComparator());
        
        //max heap
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        });
        
        heap.offer(0);
        
        int prev = 0, curr = 0;
        Point keypoint = null;
        for (Point p : points) {
            if (p.height < 0) {
                heap.offer(-p.height);
            } else {
                heap.remove(p.height);
            }
            
            curr = heap.peek();
            if (curr != prev) {
                if (keypoint == null) {
                    keypoint = new Point(p.pos, curr);
                } else {
                    if (keypoint.height != 0) {
                        ArrayList<Integer> list = new ArrayList<Integer>();
                        list.add(keypoint.pos);
                        list.add(p.pos);
                        list.add(keypoint.height);
                        res.add(list);
                    }
                    keypoint = new Point(p.pos, curr);
                }
                prev = curr;
            }
        }
        
        return res;
    }
    
    private class PointComparator implements Comparator<Point> {
        public int compare(Point p1, Point p2) {
            if (p1.pos == p2.pos) {
                // there are two cases covered here:
                // case1: same left -> the point with smaller height is prior to bigger ones
                // case2: one left, one right -> the second's left is prior to first's right
                return p1.height - p2.height;
            } else {
                return p1.pos - p2.pos;
            }
        }
    }
    private class Point {
        public int pos;
        public int height; // left: negative, right: positive        
        public Point(int pos, int height) {
            this.pos = pos;
            this.height = height;
        }
    }
}
