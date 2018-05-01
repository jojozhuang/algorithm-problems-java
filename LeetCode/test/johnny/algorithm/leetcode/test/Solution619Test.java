package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution619;

public class Solution619Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution619 instance = new Solution619();

        assertEquals(0, instance.query());
    }
}
