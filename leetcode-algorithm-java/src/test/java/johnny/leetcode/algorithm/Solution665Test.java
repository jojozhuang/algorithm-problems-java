package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution665Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("checkPossibility");
        Solution665 instance = new Solution665();

        assertEquals(true, instance.checkPossibility(new int[] {4,2,3}));
        assertEquals(false, instance.checkPossibility(new int[] {4,2,1}));
        assertEquals(false, instance.checkPossibility(new int[] {3,4,2,3}));
    }
}
