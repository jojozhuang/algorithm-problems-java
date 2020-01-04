package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution667Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("constructArray");
        Solution667 instance = new Solution667();

        assertArrayEquals(new int[] {1, 2, 3}, instance.constructArray(3,1));
        assertArrayEquals(new int[] {3, 1, 2}, instance.constructArray(3,2));
    }
}
