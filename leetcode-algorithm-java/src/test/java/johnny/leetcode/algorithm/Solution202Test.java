package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution202;

public class Solution202Test extends JunitBase {

    @Test
    public void testIsHappy() {
        System.out.println("isHappy");
        Solution202 instance = new Solution202();

        assertEquals(false, instance.isHappy(0));
        assertEquals(true, instance.isHappy(1));
        assertEquals(false, instance.isHappy(2));
        assertEquals(true, instance.isHappy(7));
        assertEquals(true, instance.isHappy(10));
        assertEquals(true, instance.isHappy(19));
        assertEquals(false, instance.isHappy(33));
        assertEquals(false, instance.isHappy(11));
        assertEquals(true, instance.isHappy(1111111));
    }
}
