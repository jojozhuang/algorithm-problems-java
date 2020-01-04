package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution457Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("circularArrayLoop");
        Solution457 instance = new Solution457();

        assertEquals(true, instance.circularArrayLoop(new int[] {2, -1, 1, 2, 2}));
        assertEquals(false, instance.circularArrayLoop(new int[] {-1,2}));
    }
}
