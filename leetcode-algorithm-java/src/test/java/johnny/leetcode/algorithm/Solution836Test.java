package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution836Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isRectangleOverlap");
        Solution836 instance = new Solution836();

        assertEquals(true, instance.isRectangleOverlap(new int[] {0,0,2,2}, new int[] {1,1,3,3}));
        assertEquals(false, instance.isRectangleOverlap(new int[] {0,0,1,1}, new int[] {1,0,2,1}));
    }
}
