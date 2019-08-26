package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution657;

public class Solution657Test extends JunitBase {

    @Test
    public void testJudgeCircle() {
        System.out.println("judgeCircle");
        Solution657 instance = new Solution657();

        assertEquals(false, instance.judgeCircle(""));
        assertEquals(true, instance.judgeCircle("UD"));
        assertEquals(false, instance.judgeCircle("LL"));
        assertEquals(true, instance.judgeCircle("UDLR"));
    }
}
