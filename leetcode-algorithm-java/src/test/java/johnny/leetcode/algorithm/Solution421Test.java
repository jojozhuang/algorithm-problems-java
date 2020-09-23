package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution421Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findMaximumXOR");
        Solution421 instance = new Solution421();

        assertEquals(28, instance.findMaximumXOR(new int[] {3, 10, 5, 25, 2, 8}));
        assertEquals(10, instance.findMaximumXOR(new int[] {8,10,2}));
    }
}
