package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution196;

public class Solution196Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution196 instance = new Solution196();

        assertEquals(0, instance.query());
    }
}
