package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution660;

public class Solution660Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("newInteger");
        Solution660 instance = new Solution660();

        assertEquals(10, instance.newInteger(9));
    }
}
