package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution823;

public class Solution823Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numFactoredBinaryTrees");
        Solution823 instance = new Solution823();

        assertEquals(3, instance.numFactoredBinaryTrees(new int[] {2, 4}));
        assertEquals(7, instance.numFactoredBinaryTrees(new int[] {2, 4, 5, 10}));
    }
}
