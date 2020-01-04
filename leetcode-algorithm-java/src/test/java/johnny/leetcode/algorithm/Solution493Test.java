package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution493Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("reversePairs");
        Solution493 instance = new Solution493();

        assertEquals(2, instance.reversePairs(new int[] {1,3,2,3,1}));
        assertEquals(3, instance.reversePairs(new int[] {2,4,3,5,1}));
    }
}
