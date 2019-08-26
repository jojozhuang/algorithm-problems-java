package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution357;

public class Solution357Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("countNumbersWithUniqueDigits");
        Solution357 instance = new Solution357();

        assertEquals(91, instance.countNumbersWithUniqueDigits(2));
    }
}
