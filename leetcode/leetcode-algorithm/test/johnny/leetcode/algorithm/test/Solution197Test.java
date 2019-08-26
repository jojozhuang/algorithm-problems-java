package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution197;

public class Solution197Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution197 instance = new Solution197();

        assertEquals(0, instance.query());
    }
}
