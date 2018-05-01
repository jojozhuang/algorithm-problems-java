package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution612;

public class Solution612Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution612 instance = new Solution612();

        assertEquals(0, instance.query());
    }
}
