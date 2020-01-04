package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
