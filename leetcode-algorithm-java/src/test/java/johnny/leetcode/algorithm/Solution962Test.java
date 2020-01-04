package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution962Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxWidthRamp");
        Solution962 instance = new Solution962();

        assertEquals(4, instance.maxWidthRamp(new int[] {6,0,8,2,1,5}));
        assertEquals(7, instance.maxWidthRamp(new int[] {9,8,1,0,1,9,4,0,4,1}));
    }
}
