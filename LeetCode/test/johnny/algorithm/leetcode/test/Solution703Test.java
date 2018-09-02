package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution703;

public class Solution703Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("KthLargest in stream");
        Solution703 kthLargest = new Solution703(3, new int[] {4,5,8,2});
        
        assertEquals(4, kthLargest.add(3));
        assertEquals(5, kthLargest.add(5));
        assertEquals(5, kthLargest.add(10));
        assertEquals(8, kthLargest.add(9));
        assertEquals(8, kthLargest.add(4));
    }
}
