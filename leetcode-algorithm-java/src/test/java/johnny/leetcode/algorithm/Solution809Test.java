package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution809;

public class Solution809Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("expressiveWords");
        Solution809 instance = new Solution809();

        assertEquals(1, instance.expressiveWords("heeellooo", new String[]{"hello", "hi", "helo"}));
    }
}
