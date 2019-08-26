package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution262;

public class Solution262Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution262 instance = new Solution262();

        assertEquals(0, instance.query());
    }
}
