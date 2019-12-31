package johnny.leetcode.algorithm;

/**
 * Rectangle Area.
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 * 
 * Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 * 
 * Rectangle Area
 * Assume that the total area is never beyond the maximum possible value of int.
 * 
 * @author Johnny
 */
public class Solution223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        //rect1 + rect2 - common
        //http://www.programcreek.com/2014/06/leetcode-rectangle-area-java/
        int rect1 = (C - A) * (D - B);
        int rect2 = (G - E) * (H - F);
        
        if(C < E || G < A) {
            return rect1 + rect2;
        }
        if(D < F || H < B) {
            return rect1 + rect2;
        }
        
        int right = Math.min(C,G);
        int left = Math.max(A,E);
        int top = Math.min(H,D);
        int bottom = Math.max(F,B);
        
        int common = (right - left) * ( top - bottom);
        
        return rect1 + rect2 - common;
    }
}
