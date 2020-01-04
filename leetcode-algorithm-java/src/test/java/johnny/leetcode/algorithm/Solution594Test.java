package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution594Test extends JunitBase {

    @Test
    public void testFindLHS() {
        System.out.println("findLHS");
        Solution594 instance = new Solution594();

        assertEquals(0, instance.findLHS(new int[]{}));
        assertEquals(0, instance.findLHS(new int[]{1}));
        assertEquals(2, instance.findLHS(new int[]{1,2}));
        assertEquals(2, instance.findLHS(new int[]{1,2,3}));
        assertEquals(3, instance.findLHS(new int[]{5,4,3,3}));
        assertEquals(5, instance.findLHS(new int[]{1,3,2,2,5,2,3,7}));
    }
}
