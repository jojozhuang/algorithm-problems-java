package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution135Test extends JunitBase {

    @Test
    public void testCandy() {
        System.out.println("candy");
        Solution135 instance = new Solution135();

        assertEquals(0, instance.candy(null));
        assertEquals(12, instance.candy(new int[]{1,4,3,1,2,3}));
    }
}
