package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution823Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numFactoredBinaryTrees");
        Solution823 instance = new Solution823();

        assertEquals(3, instance.numFactoredBinaryTrees(new int[] {2, 4}));
        assertEquals(7, instance.numFactoredBinaryTrees(new int[] {2, 4, 5, 10}));
    }
}
