package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution597;

public class Solution597Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution597 instance = new Solution597();

        assertEquals(0, instance.query());
    }
}
