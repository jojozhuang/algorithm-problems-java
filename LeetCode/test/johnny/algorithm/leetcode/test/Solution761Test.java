package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution761;

public class Solution761Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("makeLargestSpecial");
        Solution761 instance = new Solution761();

        assertEquals("11100100", instance.makeLargestSpecial("11011000"));
    }
}
