package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution261;

public class Solution261Test extends JunitBase {

    @Test
    public void testValidTree() {
        System.out.println("validTree");
        Solution261 instance = new Solution261();

        assertEquals(false, instance.validTree(0, null));

        int[][] edges2 = new int[][] {
            {0, 1}, {0, 2}, {0, 3}, {1, 4}
        };
        assertEquals(true, instance.validTree(5, edges2));
        int[][] edges3 = new int[][] {
            {0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}
        };
        assertEquals(false, instance.validTree(5, edges3));

        assertEquals(true, instance.validTree(1, new int[][] {}));
    }
}
