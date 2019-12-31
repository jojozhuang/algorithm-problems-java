package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution439;

public class Solution439Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("parseTernary");
        Solution439 instance = new Solution439();

        assertEquals("2", instance.parseTernary("T?2:3"));
        assertEquals("4", instance.parseTernary("F?1:T?4:5"));
        assertEquals("F", instance.parseTernary("T?T?F:5:3"));
    }
}
