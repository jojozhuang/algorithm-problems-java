package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution255Test extends JunitBase {

    @Test
    public void testVerifyPreorder() {
        System.out.println("verifyPreorder");
        Solution255 instance = new Solution255();

        assertEquals(true, instance.verifyPreorder(null));
        assertEquals(true, instance.verifyPreorder(new int[]{4,1,2,3,6,5,8}));
        assertEquals(true, instance.verifyPreorder(new int[]{4,1,3,2,6,5,8}));
        assertEquals(false, instance.verifyPreorder(new int[]{4,1,2,3,6,8,5}));
    }
}
