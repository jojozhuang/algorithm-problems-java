package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution509;

public class Solution509Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("fib");
        Solution509 instance = new Solution509();

        assertEquals(0, instance.fib(0));
        assertEquals(1, instance.fib(1));
        assertEquals(1, instance.fib(2));
        assertEquals(2, instance.fib(3));
        assertEquals(3, instance.fib(4));
        assertEquals(5, instance.fib(5));
        assertEquals(8, instance.fib(6));
        assertEquals(13, instance.fib(7));
        assertEquals(21, instance.fib(8));
    }
}
