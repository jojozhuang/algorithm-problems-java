package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution577;

public class Solution577Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution577 instance = new Solution577();

        assertEquals(0, instance.query());
    }
}
