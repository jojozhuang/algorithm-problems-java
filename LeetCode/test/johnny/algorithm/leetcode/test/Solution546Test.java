package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution546;

public class Solution546Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("removeBoxes");
        Solution546 instance = new Solution546();

        assertEquals(23, instance.removeBoxes(new int[] {1, 3, 2, 2, 2, 3, 4, 3, 1}));
    }
}
