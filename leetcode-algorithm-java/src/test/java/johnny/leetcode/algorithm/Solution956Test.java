package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution956Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("largestTimeFromDigits");
        Solution956 instance = new Solution956();

        assertEquals(6, instance.tallestBillboard(new int[] {1,2,3,6}));
        assertEquals(10, instance.tallestBillboard(new int[] {1,2,3,4,5,6}));
        assertEquals(0, instance.tallestBillboard(new int[] {1,2}));
    }
}
