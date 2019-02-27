package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution724;

public class Solution724Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("pivotIndex");
        Solution724 instance = new Solution724();

        assertEquals(0, instance.pivotIndex(new int[] {-1,-1,-1,0,1,1}));
        assertEquals(-1, instance.pivotIndex(new int[] {1,2}));
        assertEquals(-1, instance.pivotIndex(new int[] {1,2,3}));
        assertEquals(1, instance.pivotIndex(new int[] {1,2,1}));
        assertEquals(3, instance.pivotIndex(new int[] {1,7,3,6,5,6}));
        assertEquals(4, instance.pivotIndex(new int[] {1,2,3,6,4,5,4,3}));
    }
}
