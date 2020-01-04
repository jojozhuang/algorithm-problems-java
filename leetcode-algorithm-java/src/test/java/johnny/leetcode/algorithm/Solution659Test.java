package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution659Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isPossible");
        Solution659 instance = new Solution659();

        assertEquals(true, instance.isPossible(new int[] {1,2,3,3,4,5}));
        assertEquals(true, instance.isPossible(new int[] {1,2,3,3,4,4,5,5}));
        assertEquals(false, instance.isPossible(new int[] {1,2,3,4,4,5}));
    }
}
