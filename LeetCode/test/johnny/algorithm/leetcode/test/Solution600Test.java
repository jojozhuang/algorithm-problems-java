package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution600;

public class Solution600Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findIntegers");
        Solution600 instance = new Solution600();

        assertEquals(5, instance.findIntegers(5));
    }
}
