package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution258;

public class Solution258Test extends JunitBase {

    @Test
    public void testAddDigits() {
        System.out.println("addDigits");
        Solution258 instance = new Solution258();

        assertEquals(0, instance.addDigits(0));
        assertEquals(2, instance.addDigits(38));
        assertEquals(8, instance.addDigits(1853));
    }
}
