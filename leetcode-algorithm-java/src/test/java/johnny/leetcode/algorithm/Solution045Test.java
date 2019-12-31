package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution045;

public class Solution045Test extends JunitBase {

    @Test
    public void testJump() {
        System.out.println("jump");
        Solution045 instance = new Solution045();

        assertEquals(Integer.MAX_VALUE, instance.jump(null));
        assertEquals(0, instance.jump(new int[]{0}));
        assertEquals(0, instance.jump(new int[]{1}));
        assertEquals(1, instance.jump(new int[]{1,2}));
        assertEquals(2, instance.jump(new int[]{1,2,3}));
        assertEquals(Integer.MAX_VALUE, instance.jump(new int[]{3,2,1,0,0}));
        assertEquals(2, instance.jump(new int[]{2,3,1,1,4}));
        assertEquals(Integer.MAX_VALUE, instance.jump(new int[]{3,2,1,0,4}));
    }
}
