package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution299;

public class Solution299Test extends JunitBase {

    @Test
    public void testGetHint() {
        System.out.println("getHint");
        Solution299 instance = new Solution299();

        assertEquals("0A0B", instance.getHint("", ""));
        assertEquals("1A0B", instance.getHint("12", "13"));
        assertEquals("0A2B", instance.getHint("12", "21"));
        assertEquals("2A0B", instance.getHint("123", "113"));
        assertEquals("2A2B", instance.getHint("1234", "1432"));
        assertEquals("1A3B", instance.getHint("1807", "7810"));
        assertEquals("1A1B", instance.getHint("1123", "0111"));
    }
}
