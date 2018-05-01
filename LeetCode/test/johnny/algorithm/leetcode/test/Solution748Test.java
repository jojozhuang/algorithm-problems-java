package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution748;

public class Solution748Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("shortestCompletingWord");
        Solution748 instance = new Solution748();

        assertEquals("steps", instance.shortestCompletingWord("1s3 PSt", new String[] {"step", "steps", "stripe", "stepple"}));
        assertEquals("pest", instance.shortestCompletingWord("1s3 456", new String[] {"looks", "pest", "stew", "show"}));
    }
}
