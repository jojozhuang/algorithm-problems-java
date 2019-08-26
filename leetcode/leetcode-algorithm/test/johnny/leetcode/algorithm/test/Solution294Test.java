package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution294;

public class Solution294Test extends JunitBase {

    @Test
    public void testCanWin() {
        System.out.println("canWin");
        Solution294 instance = new Solution294();

        assertEquals(false, instance.canWin(""));
        assertEquals(true, instance.canWin("++++"));
        assertEquals(false, instance.canWin("+--+"));
        assertEquals(true, instance.canWin("++-+"));
        assertEquals(true, instance.canWin("+-++-+-"));
        assertEquals(false, instance.canWin("+-++-+-++"));
    }
}
