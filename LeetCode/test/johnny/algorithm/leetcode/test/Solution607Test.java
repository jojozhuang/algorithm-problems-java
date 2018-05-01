package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution607;

public class Solution607Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution607 instance = new Solution607();

        assertEquals(0, instance.query());
    }
}
