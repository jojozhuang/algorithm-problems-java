package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution055;

public class Solution055Test extends JunitBase {

    @Test
    public void testCanJump() {
        System.out.println("canJump");
        Solution055 instance = new Solution055();

        assertEquals(false, instance.canJump(null));
        assertEquals(true, instance.canJump(new int[]{0}));
        assertEquals(true, instance.canJump(new int[]{1}));
        assertEquals(true, instance.canJump(new int[]{1,2}));
        assertEquals(true, instance.canJump(new int[]{1,2,3}));
        assertEquals(false, instance.canJump(new int[]{3,2,1,0,0}));
        assertEquals(true, instance.canJump(new int[]{2,3,1,1,4}));
        assertEquals(false, instance.canJump(new int[]{3,2,1,0,4}));
    }
}
