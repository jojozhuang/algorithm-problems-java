package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution526;

public class Solution526Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("countArrangement");
        Solution526 instance = new Solution526();

        assertEquals(2, instance.countArrangement(2));
    }
}
