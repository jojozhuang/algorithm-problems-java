package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution033;

public class Solution033Test extends JunitBase {

    @Test
    public void testSearch() {
        System.out.println("search");
        Solution033 instance = new Solution033();

        assertEquals(-1, instance.search(null, 0));
        assertEquals(0, instance.search(new int[] {1}, 1));
        assertEquals(-1, instance.search(new int[] {1}, 0));
        assertEquals(-1, instance.search(new int[] {1, 2}, 0));
        assertEquals(0, instance.search(new int[] {1, 2}, 1));
        assertEquals(1, instance.search(new int[] {1, 2}, 2));
        assertEquals(2, instance.search(new int[] {2, 3, 1}, 1));
        assertEquals(-1, instance.search(new int[] {2, 3, 1}, 4));
        assertEquals(0, instance.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 4));
        assertEquals(4, instance.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(6, instance.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 2));
        assertEquals(3, instance.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 7));
        assertEquals(3, instance.search(new int[] {1, 1, 1, 2, 1, 1, 1}, 2));
    }
}
