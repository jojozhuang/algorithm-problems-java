package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution456Test extends JunitBase {

    @Test
    public void testFind132pattern() {
        System.out.println("find132pattern");
        Solution456 instance = new Solution456();

        assertEquals(false, instance.find132pattern(null));
        assertEquals(true, instance.find132pattern(new int[]{-2,1,2,-2,1,2}));
        assertEquals(true, instance.find132pattern(new int[]{3,5,0,3,4}));
        assertEquals(false, instance.find132pattern(new int[]{1,2,3,4}));
        assertEquals(true, instance.find132pattern(new int[]{3,1,4,2}));
        assertEquals(true, instance.find132pattern(new int[]{-1,3,2,0}));
        assertEquals(false, instance.find132pattern(new int[]{2,2,2,2}));
        assertEquals(false, instance.find132pattern(new int[]{2,3,2,0}));
    }
}
