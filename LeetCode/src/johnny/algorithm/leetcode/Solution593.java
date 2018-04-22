package johnny.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Valid Square
 * 
 * Given the coordinates of four points in 2D space, return whether the four 
 * points could construct a square.
 * 
 * The coordinate (x,y) of a point is represented by an integer array with two integers.
 * 
 * Example:
 * Input: p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,1]
 * Output: True
 * 
 * Note:
 * 1. All the input integers are in the range [-10000, 10000].
 * 2. A valid square has four equal sides with positive length and four equal angles (90-degree angles).
 * 3. Input points have no order.
 * 
 * @author Johnny
 */
public class Solution593 {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(dis(p1, p2), dis(p1, p3), dis(p1, p4), dis(p2, p3), dis(p2, p4), dis(p3, p4)));        
        return !hs.contains(0) && hs.size()==2; //One each for side & diagonal
    }
    int dis(int[] a, int[] b){
        return (a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
    }
}
