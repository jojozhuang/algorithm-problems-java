package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution585;

public class Solution585Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution585 instance = new Solution585();

        assertEquals(0, instance.query());
    }
}
