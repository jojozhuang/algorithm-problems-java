package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution574;

public class Solution574Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution574 instance = new Solution574();

        assertEquals(0, instance.query());
    }
}
