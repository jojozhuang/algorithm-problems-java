package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution096Test extends JunitBase {

    @Test
    public void testNumTrees() {
        System.out.println("numTrees");
        Solution096 instance = new Solution096();

        assertEquals(0, instance.numTrees(0));
        assertEquals(1, instance.numTrees(1));
        assertEquals(2, instance.numTrees(2));
        assertEquals(5, instance.numTrees(3));
    }
}
