package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution544;

public class Solution544Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findContestMatch");
        Solution544 instance = new Solution544();

        assertEquals("(1,2)", instance.findContestMatch(2));
        assertEquals("((1,4),(2,3))", instance.findContestMatch(4));
        assertEquals("(((1,8),(4,5)),((2,7),(3,6)))", instance.findContestMatch(8));
    }
}
