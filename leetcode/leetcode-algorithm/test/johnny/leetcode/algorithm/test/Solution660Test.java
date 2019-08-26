package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution660;

public class Solution660Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("newInteger");
        Solution660 instance = new Solution660();

        assertEquals(10, instance.newInteger(9));
        assertEquals(31, instance.newInteger(28));
    }
}
