package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution673Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findNumberOfLIS");
        Solution673 instance = new Solution673();

        assertEquals(2, instance.findNumberOfLIS(new int[] {1,3,5,4,7}));
        assertEquals(5, instance.findNumberOfLIS(new int[] {2,2,2,2,2}));
    }
}
