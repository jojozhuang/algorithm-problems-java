package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution593;

public class Solution593Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("validSquare");
        Solution593 instance = new Solution593();

        assertEquals(true, instance.validSquare(new int[] {0,0},new int[] {1,1},new int[] {1,0},new int[] {0,1}));
    }
}
