package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution762Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("countPrimeSetBits");
        Solution762 instance = new Solution762();

        assertEquals(4, instance.countPrimeSetBits(6, 10));
        assertEquals(5, instance.countPrimeSetBits(10, 15));
    }
}
