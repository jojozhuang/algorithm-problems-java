package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution323;

public class Solution323Test extends JunitBase {

    @Test
    public void testCountComponents() {
        System.out.println("countComponents");
        Solution323 instance = new Solution323();

        assertEquals(0, instance.countComponents(0, null));

        assertEquals(1, instance.countComponents(1, new int[][] {}));
        int[][] edges2 = new int[][] {
            {0, 1}, {1, 2}, {3, 4}
        };
        assertEquals(2, instance.countComponents(5, edges2));
        int[][] edges3 = new int[][] {
            {0, 1}, {1, 2}, {2, 3},{3, 4}
        };
        assertEquals(1, instance.countComponents(5, edges3));
    }
}
