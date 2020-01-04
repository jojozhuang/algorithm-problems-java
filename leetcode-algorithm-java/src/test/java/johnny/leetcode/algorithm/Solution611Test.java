package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution611Test extends JunitBase {

    @Test
    public void testTriangleNumber() {
        System.out.println("triangleNumber");
        Solution611 instance = new Solution611();

        assertEquals(0, instance.triangleNumber(null));
        assertEquals(0, instance.triangleNumber(new int[]{1,2,3}));
        assertEquals(1, instance.triangleNumber(new int[]{2,2,3}));
        assertEquals(1, instance.triangleNumber(new int[]{1,2,3,4}));
        assertEquals(3, instance.triangleNumber(new int[]{2,2,3,4}));
    }
}
