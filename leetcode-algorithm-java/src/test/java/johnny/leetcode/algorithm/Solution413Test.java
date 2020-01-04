package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution413Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numberOfArithmeticSlices");
        Solution413 instance = new Solution413();

        assertEquals(6, instance.numberOfArithmeticSlices(new int[] {1, 3, 5, 7, 9}));
        assertEquals(3, instance.numberOfArithmeticSlices(new int[] {1, 2, 3, 4}));
    }
}
