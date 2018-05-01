package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution760;

public class Solution760Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("anagramMappings");
        Solution760 instance = new Solution760();

        assertArrayEquals(new int[] {1, 4, 3, 2, 0}, instance.anagramMappings(new int[] {12, 28, 46, 32, 50}, new int[] {50, 12, 32, 46, 28}));
    }
}
