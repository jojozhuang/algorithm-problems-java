package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution359;

public class Solution359Test extends JunitBase {

    @Test
    public void testShouldPrintMessage() {
        System.out.println("shouldPrintMessage");

        Solution359 instance = new Solution359();

        assertEquals(true, instance.shouldPrintMessage(1, "foo"));
        assertEquals(true, instance.shouldPrintMessage(2, "bar"));
        assertEquals(false, instance.shouldPrintMessage(3, "foo"));
        assertEquals(false, instance.shouldPrintMessage(8, "bar"));
        assertEquals(false, instance.shouldPrintMessage(10, "foo"));
        assertEquals(true, instance.shouldPrintMessage(11, "foo"));
    }
}
