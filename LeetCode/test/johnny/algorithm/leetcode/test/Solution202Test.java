package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution202;

public class Solution202Test extends JunitBase {

    @Test
    public void testIsHappy() {
        System.out.println("isHappy");
        Solution202 instance = new Solution202();

        assertEquals(false, instance.isHappy(0));
        assertEquals(true, instance.isHappy(7));
        assertEquals(true, instance.isHappy(10));
        assertEquals(true, instance.isHappy(19));
        assertEquals(false, instance.isHappy(33));
        assertEquals(false, instance.isHappy(11));
    }
}
