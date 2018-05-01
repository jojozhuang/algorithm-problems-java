package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution579;

public class Solution579Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution579 instance = new Solution579();

        assertEquals(0, instance.query());
    }
}
