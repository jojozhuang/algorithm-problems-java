package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution586;

public class Solution586Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution586 instance = new Solution586();

        assertEquals(0, instance.query());
    }
}
