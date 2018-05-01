package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution176;

public class Solution176Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution176 instance = new Solution176();

        assertEquals(0, instance.query());
    }
}
