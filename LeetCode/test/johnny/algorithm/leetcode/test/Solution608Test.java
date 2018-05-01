package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution608;

public class Solution608Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution608 instance = new Solution608();

        assertEquals(0, instance.query());
    }
}
