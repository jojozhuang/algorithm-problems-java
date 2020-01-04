package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
