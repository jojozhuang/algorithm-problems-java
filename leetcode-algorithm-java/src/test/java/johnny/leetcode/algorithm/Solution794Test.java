package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution794Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("validTicTacToe");
        Solution794 instance = new Solution794();

        assertEquals(false, instance.validTicTacToe(new String[] {"O  ", "   ", "   "}));
        assertEquals(false, instance.validTicTacToe(new String[] {"XOX", " X ", "   "}));
        assertEquals(false, instance.validTicTacToe(new String[] {"XXX", "   ", "OOO"}));
        assertEquals(true, instance.validTicTacToe(new String[] {"XOX", "O O", "XOX"}));
    }
}
