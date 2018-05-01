package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution072;

public class Solution072Test extends JunitBase {

    @Test
    public void testMinDistance() {
        System.out.println("minDistance");
        Solution072 instance = new Solution072();

        assertEquals(0, instance.minDistance("", ""));
        assertEquals(0, instance.minDistance("a", "a"));
        assertEquals(1, instance.minDistance("a", "b"));
        assertEquals(1, instance.minDistance("a", "aa"));
        assertEquals(1, instance.minDistance("a", "ab"));
        assertEquals(2, instance.minDistance("a", "cd"));
        assertEquals(2, instance.minDistance("a", "abc"));
        assertEquals(3, instance.minDistance("mart", "karma"));
    }
}
