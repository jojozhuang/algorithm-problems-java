package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution678;

public class Solution678Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("checkValidString");
        Solution678 instance = new Solution678();

        assertEquals(true, instance.checkValidString("()"));
        assertEquals(true, instance.checkValidString("(*)"));
        assertEquals(true, instance.checkValidString("(*))"));
    }
}
