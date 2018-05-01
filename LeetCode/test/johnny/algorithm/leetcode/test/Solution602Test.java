package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution602;

public class Solution602Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution602 instance = new Solution602();

        assertEquals(0, instance.query());
    }
}
