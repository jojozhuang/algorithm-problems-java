package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution360Test extends JunitBase {

    @Test
    public void testSortTransformedArray() {
        System.out.println("sortTransformedArray");
        Solution360 instance = new Solution360();

        assertArrayEquals(new int[]{}, instance.sortTransformedArray(null, 0, 0, 0));
        assertArrayEquals(new int[]{3, 9, 15, 33}, instance.sortTransformedArray(new int[]{-4, -2, 2, 4}, 1, 3, 5));
        assertArrayEquals(new int[]{-23, -5, 1, 7}, instance.sortTransformedArray(new int[]{-4, -2, 2, 4}, -1, 3, 5));
    }
}
