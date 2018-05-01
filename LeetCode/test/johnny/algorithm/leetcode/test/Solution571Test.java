package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution571;

public class Solution571Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution571 instance = new Solution571();

        assertEquals(0, instance.query());
    }
}
