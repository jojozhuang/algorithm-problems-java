package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution601;

public class Solution601Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution601 instance = new Solution601();

        assertEquals(0, instance.query());
    }
}
