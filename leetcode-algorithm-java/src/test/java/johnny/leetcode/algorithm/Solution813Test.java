package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution813Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("largestSumOfAverages");
        Solution813 instance = new Solution813();

        assertEquals(20, instance.largestSumOfAverages(new int[] {9,1,2,3,9}, 3), 0.0);
    }
}
