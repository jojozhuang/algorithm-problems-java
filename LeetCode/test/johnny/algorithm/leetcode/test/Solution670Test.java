package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution670;

public class Solution670Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maximumSwap");
        Solution670 instance = new Solution670();

        assertEquals(7236, instance.maximumSwap(2736));
        assertEquals(9973, instance.maximumSwap(9973));
    }
}
