package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution153Test extends JunitBase {

    @Test
    public void testFindMin() {
        System.out.println("findMin");
        Solution153 instance = new Solution153();

        assertEquals(-1, instance.findMin(null));
        assertEquals(1, instance.findMin(new int[] {1}));
        assertEquals(1, instance.findMin(new int[] {1, 2}));
        assertEquals(1, instance.findMin(new int[] {1, 2, 3}));
        assertEquals(1, instance.findMin(new int[] {3, 1, 2}));
        assertEquals(1, instance.findMin(new int[] {4, 3, 1, 2}));
        assertEquals(0, instance.findMin(new int[] {4, 5, 6, 7, 0, 1, 2}));
    }
}
