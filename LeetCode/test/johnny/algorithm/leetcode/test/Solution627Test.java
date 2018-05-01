package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution627;

public class Solution627Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution627 instance = new Solution627();

        assertEquals(0, instance.query());
    }
}
