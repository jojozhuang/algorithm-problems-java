package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution164Test extends JunitBase {

    @Test
    public void testMaximumGap() {
        System.out.println("maximumGap");
        Solution164 instance = new Solution164();

        assertEquals(0, instance.maximumGap(null));
        assertEquals(1, instance.maximumGap(new int[]{3,1,4,2}));
        assertEquals(6, instance.maximumGap(new int[]{5,9,8,3,15}));
        assertEquals(3, instance.maximumGap(new int[]{1,3,4,7}));
    }
}
