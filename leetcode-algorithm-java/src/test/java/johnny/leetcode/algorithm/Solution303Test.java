package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution303Test extends JunitBase {

    @Test
    public void testSumRange() {
        System.out.println("sumRange");
        Solution303 instance = new Solution303(new int[]{});

        //assertEquals(0, instance.sumRange(0, 0));

        Solution303 instance2 = new Solution303(new int[]{1});
        assertEquals(1, instance2.sumRange(0, 0));
        //assertEquals(0, instance2.sumRange(0, 1));

        Solution303 instance3 = new Solution303(new int[]{1,2,3,4,5});
        assertEquals(3, instance3.sumRange(0, 1));
        assertEquals(6, instance3.sumRange(0, 2));
        assertEquals(9, instance3.sumRange(3, 4));

        Solution303 instance4 = new Solution303(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(1, instance4.sumRange(0, 2));
        assertEquals(-1, instance4.sumRange(2, 5));
        assertEquals(-3, instance4.sumRange(0, 5));
    }
}
