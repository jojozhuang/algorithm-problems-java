package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution570;

public class Solution570Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution570 instance = new Solution570();

        assertEquals(0, instance.query());
    }
}
