package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import johnny.algorithm.common.Point;

/**
 * Erect the Fence
 * 
 * There are some trees, where each tree is represented by (x,y) coordinate in 
 * a two-dimensional garden. Your job is to fence the entire garden using the 
 * minimum length of rope as it is expensive. The garden is well fenced only 
 * if all the trees are enclosed. Your task is to help find the coordinates of 
 * trees which are exactly located on the fence perimeter.
 * 
 * Example 1:
 * Input: [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]
 * Output: [[1,1],[2,0],[4,2],[3,3],[2,4]]
 * Explanation:
 * 
 * Example 2:
 * Input: [[1,2],[2,2],[4,2]]
 * Output: [[1,2],[2,2],[4,2]]
 * Explanation:
 * 
 * Even you only have trees in a line, you need to use rope to enclose them. 
 * 
 * Note:
 * 
 * 1. All trees should be enclosed together. You cannot cut the rope to enclose 
 * trees that will separate them in more than one group.
 * 2. All input integers will range from 0 to 100.
 * 3. The garden has at least one tree.
 * 4. All coordinates are distinct.
 * 5. Input points have NO order. No order required for output.
 * 
 * @author Johnny
 */
public class Solution587 {
    public List<Point> outerTrees(Point[] points) {
        Set<Point> result = new HashSet<>();
        
        // Find the leftmost point
        Point first = points[0];
        int firstIndex = 0;
        for (int i = 1; i < points.length; i++) {
            if (points[i].x < first.x) {
                first = points[i];
                firstIndex = i;
            }
        }
        result.add(first);
        
        Point cur = first;
        int curIndex = firstIndex;
        do {
            Point next = points[0];
            int nextIndex = 0;
            for (int i = 1; i < points.length; i++) {
                if (i == curIndex) continue;
                int cross = crossProductLength(cur, points[i], next);
                if (nextIndex == curIndex || cross > 0 ||
                        // Handle collinear points
                        (cross == 0 && distance(points[i], cur) > distance(next, cur))) {
                    next = points[i];
                    nextIndex = i;
                }
            }
            // Handle collinear points
            for (int i = 0; i < points.length; i++) {
                if (i == curIndex) continue;
                int cross = crossProductLength(cur, points[i], next);
                if (cross == 0) {
                    result.add(points[i]);
                }
            }

            cur = next;
            curIndex = nextIndex;
            
        } while (curIndex != firstIndex);
        
        return new ArrayList<Point>(result);
    }
    
    private int crossProductLength(Point A, Point B, Point C) {
        // Get the vectors' coordinates.
        int BAx = A.x - B.x;
        int BAy = A.y - B.y;
        int BCx = C.x - B.x;
        int BCy = C.y - B.y;
    
        // Calculate the Z coordinate of the cross product.
        return (BAx * BCy - BAy * BCx);
    }

    private int distance(Point p1, Point p2) {
        return (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y);
    }
}
