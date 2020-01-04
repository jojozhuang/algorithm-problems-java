package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution371Test extends JunitBase {

    @Test
    public void testGetSum() {
        System.out.println("getSum");
        Solution371 instance = new Solution371();

        assertEquals(0, instance.getSum(0, 0));
        assertEquals(3, instance.getSum(1, 2));
    }
}
