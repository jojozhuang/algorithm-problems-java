package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution079;

public class Solution079Test extends JunitBase {

    @Test
    public void testExist() {
        System.out.println("exist");
        Solution079 instance = new Solution079();

        assertEquals(false, instance.exist(null, ""));

        char[][] board2 = new char[][] {
            "ABCE".toCharArray(),"SFCS".toCharArray(), "ADEE".toCharArray()
        };
        assertEquals(true, instance.exist(board2, "ABCCED"));
        assertEquals(true, instance.exist(board2, "SEE"));
        assertEquals(false, instance.exist(board2, "ABCB"));

        char[][] board3 = new char[][] {
            "ABCE".toCharArray(),"SFES".toCharArray(), "ADEE".toCharArray()
        };
        assertEquals(true, instance.exist(board3, "ABCESEEEFS"));
    }
}
