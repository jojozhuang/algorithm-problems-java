package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution042Test extends JunitBase {

    @Test
    public void testTrap() {
        System.out.println("trap");
        Solution042 instance = new Solution042();

        assertEquals(0, instance.trap(null));
        assertEquals(6, instance.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
