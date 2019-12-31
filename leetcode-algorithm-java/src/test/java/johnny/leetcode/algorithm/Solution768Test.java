package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution768;

public class Solution768Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxChunksToSorted");
        Solution768 instance = new Solution768();

        assertEquals(1, instance.maxChunksToSorted(new int[] {5,4,3,2,1}));
        assertEquals(4, instance.maxChunksToSorted(new int[] {2,1,3,4,4}));
    }
}
