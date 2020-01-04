package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution679Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("judgePoint24");
        Solution679 instance = new Solution679();

        assertEquals(true, instance.judgePoint24(new int[] {4, 1, 8, 7}));
        //assertEquals(true, instance.judgePoint24(new int[] {1, 2, 1, 2}));
    }
}
