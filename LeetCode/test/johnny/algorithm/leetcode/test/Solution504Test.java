package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution504;

public class Solution504Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("convertToBase7");
        Solution504 instance = new Solution504();

        assertEquals("202", instance.convertToBase7(100));
        assertEquals("-10", instance.convertToBase7(-7));
    }
}
