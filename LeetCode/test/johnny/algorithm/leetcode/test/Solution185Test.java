package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution185;

public class Solution185Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution185 instance = new Solution185();

        assertEquals(0, instance.query());
    }
}
