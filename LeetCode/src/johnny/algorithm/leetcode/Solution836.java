package johnny.algorithm.leetcode;

/**
 *
 * @author Johnny
 */
public class Solution836 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (rec1 == null || rec2 == null) {
            return false;
        }
        
        if (rec2[0] >= rec1[2] || rec2[1] >= rec1[3] || rec2[2] <= rec1[0] || rec2[3] <= rec1[1]) {
            return false;
        }

        return true;
    }
}
