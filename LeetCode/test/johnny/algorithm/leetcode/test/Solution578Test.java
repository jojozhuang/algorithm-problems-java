package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution578;

public class Solution578Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution578 instance = new Solution578();

        assertEquals(0, instance.query());
    }
}
