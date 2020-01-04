package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution593Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("validSquare");
        Solution593 instance = new Solution593();

        assertEquals(true, instance.validSquare(new int[] {0,0},new int[] {1,1},new int[] {1,0},new int[] {0,1}));
    }
}
