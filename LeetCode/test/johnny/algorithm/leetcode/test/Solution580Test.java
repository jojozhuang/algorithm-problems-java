package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution580;

public class Solution580Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution580 instance = new Solution580();

        assertEquals(0, instance.query());
    }
}
