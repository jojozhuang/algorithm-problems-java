package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution461Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("hammingDistance");
        Solution461 instance = new Solution461();

        assertEquals(2, instance.hammingDistance(1,4));
    }
}
