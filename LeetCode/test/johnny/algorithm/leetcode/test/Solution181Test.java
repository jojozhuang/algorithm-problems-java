package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution181;

public class Solution181Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution181 instance = new Solution181();

        assertEquals(0, instance.query());
    }
}
