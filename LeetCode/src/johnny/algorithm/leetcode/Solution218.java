package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * The Skyline Problem.
 * 
 * A city's skyline is the outer contour of the silhouette formed by all the 
 * buildings in that city when viewed from a distance. Now suppose you are given
 * the locations and height of all the buildings as shown on a cityscape photo 
 * (Figure A), write a program to output the skyline formed by these buildings 
 * collectively (Figure B).
 * 
 * Buildings  Skyline Contour
 * The geometric information of each building is represented by a triplet of 
 * integers [Li, Ri, Hi], where Li and Ri are the x coordinates of the left and 
 * right edge of the ith building, respectively, and Hi is its height. It is 
 * guaranteed that 0 ≤ Li, Ri ≤ INT_MAX, 0 < Hi ≤ INT_MAX, and Ri - Li > 0. 
 * You may assume all buildings are perfect rectangles grounded on an absolutely 
 * flat surface at height 0.
 * 
 * For instance, the dimensions of all buildings in Figure A are recorded as:
 * [ [2 9 10], [3 7 15], [5 12 12], [15 20 10], [19 24 8] ] .
 * 
 * The output is a list of "key points" (red dots in Figure B) in the format 
 * of [ [x1,y1], [x2, y2], [x3, y3], ... ] that uniquely defines a skyline. A 
 * key point is the left endpoint of a horizontal line segment. Note that the 
 * last key point, where the rightmost building ends, is merely used to mark the
 * termination of the skyline, and always has zero height. Also, the ground in 
 * between any two adjacent buildings should be considered part of the skyline
 * contour.
 * 
 * For instance, the skyline in Figure B should be represented 
 * as:[ [2 10], [3 15], [7 12], [12 0], [15 10], [20 8], [24, 0] ].
 * 
 * Notes:
 * 
 * The number of buildings in any input list is guaranteed to be in the 
 * range [0, 10000].
 * The input list is already sorted in ascending order by the left x position Li.
 * The output list must be sorted by the x position.
 * There must be no consecutive horizontal lines of equal height in the output 
 * skyline. For instance, [...[2 3], [4 5], [7 5], [11 5], [12 7]...] is not 
 * acceptable; the three lines of height 5 should be merged into one in the
 * final output as such: [...[2 3], [4 5], [12 7], ...]
 * 
 * @author Johnny
 */
public class Solution218 {
  //https://segmentfault.com/a/1190000003786782
    public List<int[]> getSkyline(int[][] buildings) {
        List<int[]> res = new ArrayList<int[]>();
        if (buildings == null || buildings.length == 0 || buildings[0].length == 0) {
            return res;
        }
        List<int[]> result = new ArrayList<>();
        List<int[]> height = new ArrayList<>();
        for(int[] b:buildings) {
            // start point has negative height value
            height.add(new int[]{b[0], -b[2]});
            // end point has normal height value
            height.add(new int[]{b[1], b[2]}); 
        }

        // sort $height, based on the first value, if necessary, use the second to
        // break ties
        Collections.sort(height, (a, b) -> {
                if(a[0] != b[0]) 
                    return a[0] - b[0];
                return a[1] - b[1];
        });

        // Use a maxHeap to store possible heights
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));

        // Provide a initial value to make it more consistent
        pq.offer(0);

        // Before starting, the previous max height is 0;
        int prev = 0;

        // visit all points in order
        for(int[] h:height) {
            if(h[1] < 0) { // a start point, add height
                pq.offer(-h[1]);
            } else {  // a end point, remove height
                pq.remove(h[1]);
            }
            int cur = pq.peek(); // current max height;
      
            // compare current max height with previous max height, update result and 
            // previous max height if necessary
            if(prev != cur) {
                result.add(new int[]{h[0], cur});
                prev = cur;
            }
        }
        return result;
    }
    public List<int[]> getSkyline3(int[][] buildings) {
        List<int[]> res = new ArrayList<int[]>();
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
        for (Point p : points) {
            if (p.height < 0) {
                heap.offer(-p.height);
            } else {
                heap.remove(p.height);
            }
            
            curr = heap.peek();
            if (curr != prev) {
                res.add(new int[]{p.pos, curr});
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
    
    //http://www.cnblogs.com/easonliu/p/4531020.html
    //http://www.programcreek.com/2014/06/leetcode-the-skyline-problem-java/
    public List<int[]> getSkyline2(int[][] buildings) {
        List<int[]> res = new ArrayList<int[]>();
        if (buildings == null || buildings.length == 0) {
            return res;
        }

        List<int[]> height = new ArrayList<int[]>();
        for (int[] item : buildings) {
            height.add(new int[]{item[0], -item[2]});
            height.add(new int[]{item[1], item[2]});
        }
        Collections.sort(height, new HeightComparator());
        
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(10, Collections.reverseOrder());
        heap.add(0);
        int pre = 0, cur = 0;
        for (int[] h: height) {
            if (h[1] < 0) {
                heap.add(-h[1]);
            } else {
                heap.remove(h[1]);
            }   
            cur = heap.peek();
            if (cur != pre) {
                res.add(new int[]{h[0], cur});
                pre = cur;
            }
        }
        return res;
    }
    
    private class HeightComparator implements Comparator<int[]> {
        public int compare(int[] h1, int[] h2) {
            if (h1[0] != h2[0]) {
                return h1[0] - h2[0];
            }
            if (h1[1] < 0 && h2[1] < 0) {
                return -h2[1] - (-h1[1]);
            } else if (h1[1] > 0 && h2[1] > 0) {
                return h1[1] - h2[1];
            } else {
                return h1[1] < 0 ? -1 : 1;
            }
        }
    }
}
