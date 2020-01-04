package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution477Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("totalHammingDistance");
        Solution477 instance = new Solution477();

        assertEquals(6, instance.totalHammingDistance(new int[] {4, 14, 2}));
    }
}
