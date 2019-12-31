package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution215;

public class Solution215Test extends JunitBase {

    @Test
    public void testFindKthLargest() {
        System.out.println("findKthLargest");
        Solution215 instance = new Solution215();

        assertEquals(0, instance.findKthLargest(null, 0));
        assertEquals(6, instance.findKthLargest(new int[]{3,2,1,5,6,4}, 1));
        assertEquals(5, instance.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
        assertEquals(4, instance.findKthLargest(new int[]{3,2,1,5,6,4}, 3));
        assertEquals(3, instance.findKthLargest(new int[]{3,2,1,5,6,4}, 4));
        assertEquals(2, instance.findKthLargest(new int[]{3,2,1,5,6,4}, 5));
        assertEquals(1, instance.findKthLargest(new int[]{3,2,1,5,6,4}, 6));
    }
}
