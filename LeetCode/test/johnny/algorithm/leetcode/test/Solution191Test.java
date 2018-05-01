package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution191;

public class Solution191Test extends JunitBase {

    @Test
    public void testHammingWeight() {
        System.out.println("hammingWeight");
        Solution191 instance = new Solution191();

        assertEquals(0, instance.hammingWeight(0));
        assertEquals(1, instance.hammingWeight(1));
        assertEquals(1, instance.hammingWeight(2));
        assertEquals(2, instance.hammingWeight(3));
        assertEquals(1, instance.hammingWeight(4));
        assertEquals(2, instance.hammingWeight(5));
        assertEquals(2, instance.hammingWeight(6));
        assertEquals(3, instance.hammingWeight(7));
        assertEquals(1, instance.hammingWeight(8));
        assertEquals(2, instance.hammingWeight(9));
        assertEquals(2, instance.hammingWeight(10));
        assertEquals(3, instance.hammingWeight(11));
        assertEquals(31, instance.hammingWeight(2147483647));
        assertEquals(1, instance.hammingWeight(-2147483648));
        //assertEquals(1, instance.hammingWeight(2147483648l));
    }
}
