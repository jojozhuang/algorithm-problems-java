package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution504;

public class Solution504Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("convertToBase7");
        Solution504 instance = new Solution504();

        assertEquals("202", instance.convertToBase7(100));
        assertEquals("-10", instance.convertToBase7(-7));
    }
}
