package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution081;

public class Solution081Test extends JunitBase {

    @Test
    public void testSearch() {
        System.out.println("search");
        Solution081 instance = new Solution081();

        assertEquals(false, instance.search(null, 0));
        assertEquals(true, instance.search(new int[] { 1 }, 1));
        assertEquals(false, instance.search(new int[] { 1 }, 0));
        assertEquals(true, instance.search(new int[] { 2, 1 }, 1));
        assertEquals(true, instance.search(new int[] { 2, 1 }, 2));
        assertEquals(false, instance.search(new int[] { 2, 1 }, 3));
        assertEquals(true, instance.search(new int[] { 2, 1, 1 }, 1));
        assertEquals(true, instance.search(new int[] { 1, 1, 2, 1 }, 2));
        assertEquals(false, instance.search(new int[] { 1, 1, 2, 1 }, 0));
    }
}
