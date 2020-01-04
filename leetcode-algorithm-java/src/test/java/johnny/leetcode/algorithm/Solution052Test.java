package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution052Test extends JunitBase {

    @Test
    public void testTotalNQueens() {
        System.out.println("totalNQueens");
        Solution052 instance = new Solution052();

        assertEquals(0, instance.totalNQueens(0));
        assertEquals(1, instance.totalNQueens(1));
        assertEquals(0, instance.totalNQueens(2));
        assertEquals(0, instance.totalNQueens(3));
        assertEquals(2, instance.totalNQueens(4));
    }
}
