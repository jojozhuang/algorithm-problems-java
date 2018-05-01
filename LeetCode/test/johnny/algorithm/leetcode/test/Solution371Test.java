package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution371;

public class Solution371Test extends JunitBase {

    @Test
    public void testGetSum() {
        System.out.println("getSum");
        Solution371 instance = new Solution371();

        assertEquals(0, instance.getSum(0, 0));
        assertEquals(3, instance.getSum(1, 2));
    }
}
