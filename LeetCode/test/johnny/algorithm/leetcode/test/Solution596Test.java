package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution596;

public class Solution596Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution596 instance = new Solution596();

        assertEquals(0, instance.query());
    }
}
