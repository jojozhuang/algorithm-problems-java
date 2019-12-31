package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution788;

public class Solution788Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("rotatedDigits");
        Solution788 instance = new Solution788();

        assertEquals(4, instance.rotatedDigits(10));
    }
}
