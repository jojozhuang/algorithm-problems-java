package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution601;

public class Solution601Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution601 instance = new Solution601();

        assertEquals(0, instance.query());
    }
}
