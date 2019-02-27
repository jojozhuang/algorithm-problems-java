package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution062;

public class Solution062Test extends JunitBase {

    @Test
    public void testUniquePaths() {
        System.out.println("uniquePaths");
        Solution062 instance = new Solution062();

        //assertEquals(0, instance.uniquePaths(0, 0));
        assertEquals(1, instance.uniquePaths(1, 1));
        assertEquals(1, instance.uniquePaths(3, 1));
        assertEquals(1, instance.uniquePaths(1, 4));
        assertEquals(2, instance.uniquePaths(2, 2));
        assertEquals(3, instance.uniquePaths(3, 2));
        assertEquals(3, instance.uniquePaths(2, 3));
        assertEquals(6, instance.uniquePaths(3, 3));
        assertEquals(86493225, instance.uniquePaths(19, 13));
    }
}
