package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution238;

public class Solution238Test extends JunitBase {

    @Test
    public void testProductExceptSelf() {
        System.out.println("productExceptSelf");
        Solution238 instance = new Solution238();

        assertArrayEquals(new int[]{2,1}, instance.productExceptSelf(new int[]{1,2}));
        assertArrayEquals(new int[]{12,4,3}, instance.productExceptSelf(new int[]{1,3,4}));
        assertArrayEquals(new int[]{0,0}, instance.productExceptSelf(new int[]{0,0}));
        assertArrayEquals(new int[]{0,1}, instance.productExceptSelf(new int[]{1,0}));
    }
}
