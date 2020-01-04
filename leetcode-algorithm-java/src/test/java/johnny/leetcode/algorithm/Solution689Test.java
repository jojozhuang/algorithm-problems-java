package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution689Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxSumOfThreeSubarrays");
        Solution689 instance = new Solution689();

        assertArrayEquals(new int[] {0, 3, 5}, instance.maxSumOfThreeSubarrays(new int[] {1,2,1,2,6,7,5,1}, 2));
    }
}
