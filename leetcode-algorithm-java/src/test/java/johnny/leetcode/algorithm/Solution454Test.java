package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution454Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("fourSumCount");
        Solution454 instance = new Solution454();

        assertEquals(2, instance.fourSumCount(new int[] {1,2,}, new int[] {-2,-1}, new int[] {-1,2}, new int[] {0, 2}));
    }
}
