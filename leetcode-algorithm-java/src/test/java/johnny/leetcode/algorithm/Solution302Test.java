package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution302;

public class Solution302Test extends JunitBase {

    @Test
    public void testMinArea() {
        System.out.println("minArea");
        Solution302 instance = new Solution302();

        assertEquals(0, instance.minArea(null, 0, 0));

        char[][] image2 = new char[][] {
            {'0','0','1','0'},
            {'0','1','1','0'},
            {'0','1','0','0'}
        };
        assertEquals(6, instance.minArea(image2, 0, 2));
    }
}
