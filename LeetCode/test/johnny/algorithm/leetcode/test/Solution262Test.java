package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution262;

public class Solution262Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution262 instance = new Solution262();

        assertEquals(0, instance.query());
    }
}
