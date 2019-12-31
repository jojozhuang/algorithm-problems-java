package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution391;

public class Solution391Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isRectangleCover");
        Solution391 instance = new Solution391();

        int[][] rectangles1 = new int[][] {
            {1,1,3,3},
            {3,1,4,2},
            {3,2,4,4},
            {1,3,2,4},
            {2,3,3,4}
        };
        assertEquals(true, instance.isRectangleCover(rectangles1));

        int[][] rectangles2 = new int[][] {
            {1,1,2,3},
            {1,3,2,4},
            {3,1,4,2},
            {3,2,4,4}
        };
        assertEquals(false, instance.isRectangleCover(rectangles2));

        int[][] rectangles3 = new int[][] {
            {1,1,3,3},
            {3,1,4,2},
            {1,3,2,4},
            {3,2,4,4}
        };
        assertEquals(false, instance.isRectangleCover(rectangles3));

        int[][] rectangles4 = new int[][] {
            {1,1,3,3},
            {3,1,4,2},
            {1,3,2,4},
            {2,2,4,4}
        };
        assertEquals(false, instance.isRectangleCover(rectangles4));
    }
}
