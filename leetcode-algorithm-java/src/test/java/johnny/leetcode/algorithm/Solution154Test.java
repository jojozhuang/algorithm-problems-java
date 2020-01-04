package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution154Test extends JunitBase {

    @Test
    public void testFindMin() {
        System.out.println("findMin");
        Solution154 instance = new Solution154();

        assertEquals(-1, instance.findMin(null));
        assertEquals(1, instance.findMin(new int[] {1}));
        assertEquals(1, instance.findMin(new int[] {1, 2}));
        assertEquals(2, instance.findMin(new int[] {5,2,3}));
        assertEquals(2, instance.findMin(new int[] {3, 2, 3, 3, 3, 3}));
    }
}
