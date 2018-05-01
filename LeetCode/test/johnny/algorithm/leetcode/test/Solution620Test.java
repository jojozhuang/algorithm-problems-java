package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution620;

public class Solution620Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution620 instance = new Solution620();

        assertEquals(0, instance.query());
    }
}
