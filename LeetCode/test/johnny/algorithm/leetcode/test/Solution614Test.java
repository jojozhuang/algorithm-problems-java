package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution614;

public class Solution614Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution614 instance = new Solution614();

        assertEquals(0, instance.query());
    }
}
