package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution573Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minDistance");
        Solution573 instance = new Solution573();

        assertEquals(12, instance.minDistance(5,7, new int[] {2,2}, new int[] {4,4},new int[][] {{3,0},{2,5}}));
    }
}
