package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution178;

public class Solution178Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution178 instance = new Solution178();

        assertEquals(0, instance.query());
    }
}
