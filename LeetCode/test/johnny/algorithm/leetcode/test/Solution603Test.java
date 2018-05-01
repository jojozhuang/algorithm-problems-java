package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution603;

public class Solution603Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution603 instance = new Solution603();

        assertEquals(0, instance.query());
    }
}
