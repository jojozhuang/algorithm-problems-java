package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
