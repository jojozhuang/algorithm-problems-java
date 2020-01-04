package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution546Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("removeBoxes");
        Solution546 instance = new Solution546();

        assertEquals(23, instance.removeBoxes(new int[] {1, 3, 2, 2, 2, 3, 4, 3, 1}));
    }
}
