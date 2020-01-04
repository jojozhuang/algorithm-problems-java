package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution292Test extends JunitBase {

    @Test
    public void testCanWinNim() {
        System.out.println("canWinNim");
        Solution292 instance = new Solution292();

        assertEquals(false, instance.canWinNim(0));
        assertEquals(false, instance.canWinNim(4));
        assertEquals(true, instance.canWinNim(3));
    }
}
